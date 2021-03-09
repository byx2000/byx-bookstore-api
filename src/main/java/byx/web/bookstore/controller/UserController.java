package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.pojo.dto.LoginDTO;
import byx.web.bookstore.pojo.vo.UserVO;
import byx.web.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public Result<UserVO> login(@RequestBody @Validated LoginDTO dto) {
        return Result.success(userService.login(dto));
    }
}
