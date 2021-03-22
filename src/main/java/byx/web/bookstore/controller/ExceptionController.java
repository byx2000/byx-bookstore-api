package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.common.Status;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionController {
    @RequestMapping("/no-login")
    public Result<?> noLogin() {
        return Result.fail(Status.NOT_LOGGED_IN);
    }
}
