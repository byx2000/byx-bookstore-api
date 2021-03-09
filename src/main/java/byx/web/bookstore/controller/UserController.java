package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.common.Status;
import byx.web.bookstore.common.UserManager;
import byx.web.bookstore.pojo.dto.LoginDTO;
import byx.web.bookstore.pojo.vo.UserVO;
import byx.web.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserManager userManager;

    @PostMapping("/login")
    public Result<UserVO> login(@RequestBody @Validated LoginDTO dto) {
        UserVO currentUser = userService.login(dto);
        userManager.setCurrentUser(currentUser);
        return Result.success(currentUser);
    }

    @PostMapping("/current")
    public Result<?> getCurrentUser() {
        UserVO currentUser = userManager.getCurrentUser();
        if (currentUser == null) {
            return Result.fail(Status.NOT_LOGGED_IN);
        }
        return Result.success(currentUser);
    }
}
