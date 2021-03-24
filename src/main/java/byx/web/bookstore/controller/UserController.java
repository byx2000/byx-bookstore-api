package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.common.Status;
import byx.web.bookstore.common.UserManager;
import byx.web.bookstore.pojo.dto.LoginDTO;
import byx.web.bookstore.pojo.dto.RegisterRequestDTO;
import byx.web.bookstore.pojo.dto.UserRegisterDTO;
import byx.web.bookstore.pojo.vo.UserVO;
import byx.web.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserManager userManager;

    @Autowired
    private HttpSession session;

    @PostMapping("/login")
    public Result<UserVO> login(@RequestBody @Validated LoginDTO dto) {
        UserVO currentUser = userService.login(dto);
        userManager.setCurrentUser(currentUser);
        return Result.success(currentUser);
    }

    @PostMapping("/current")
    public Result<?> getCurrentUser() {
        return Result.success(userManager.getCurrentUser());
    }

    @PostMapping("/logout")
    public Result<?> logout() {
        userManager.logout();
        return Result.success("注销成功");
    }

    @PostMapping("register")
    public Result<?> register(@Validated RegisterRequestDTO dto) {
        String checkCode = (String) session.getAttribute("checkCode");
        if (checkCode == null || !checkCode.equalsIgnoreCase(dto.getCheckCode())) {
            return Result.fail(Status.CHECK_CODE_ERROR, "验证码错误");
        }
        session.removeAttribute("checkCode");

        File staticResourcePath = new File(new ApplicationHome().getDir(), "static");
        File uploadPath = new File(staticResourcePath, "upload/avatar");
        System.out.println(uploadPath.getPath());

        UserRegisterDTO dto2 = new UserRegisterDTO();
        dto2.setUsername(dto.getUsername());
        dto2.setNickname(dto.getNickname());
        dto2.setPassword(dto.getPassword());

        int newId = -1;

        try {
            newId = userService.register(dto2);
            dto.getAvatar().transferTo(new File(uploadPath, newId + ".jpg"));
            return Result.success();
        } catch (IOException e) {
            if (newId != -1) {
                userService.delete(newId);
            }
            return Result.fail(Status.SAVE_AVATAR_FAILED);
        }
    }
}
