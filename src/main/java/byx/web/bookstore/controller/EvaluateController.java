package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.common.UserManager;
import byx.web.bookstore.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evaluate")
public class EvaluateController {
    @Autowired
    private EvaluateService evaluateService;

    @Autowired
    private UserManager userManager;

    @PostMapping("/is-like")
    public Result<Boolean> isLike(@RequestBody Integer bookId) {
        return Result.success(evaluateService.isLike(userManager.getCurrentUser().getId(), bookId));
    }
}
