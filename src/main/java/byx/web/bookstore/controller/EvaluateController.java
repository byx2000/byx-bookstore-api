package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.common.UserManager;
import byx.web.bookstore.pojo.dto.EvaluateDTO;
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
        EvaluateDTO dto = new EvaluateDTO();
        dto.setUserId(userManager.getCurrentUser().getId());
        dto.setBookId(bookId);
        return Result.success(evaluateService.isLike(dto));
    }

    @PostMapping("/is-dislike")
    public Result<Boolean> isDislike(@RequestBody Integer bookId) {
        EvaluateDTO dto = new EvaluateDTO();
        dto.setUserId(userManager.getCurrentUser().getId());
        dto.setBookId(bookId);
        return Result.success(evaluateService.isDislike(dto));
    }

    @PostMapping("/like")
    public Result<?> like(@RequestBody Integer bookId) {
        EvaluateDTO dto = new EvaluateDTO();
        dto.setUserId(userManager.getCurrentUser().getId());
        dto.setBookId(bookId);
        evaluateService.like(dto);
        return Result.success();
    }

    @PostMapping("/dislike")
    public Result<?> dislike(@RequestBody Integer bookId) {
        EvaluateDTO dto = new EvaluateDTO();
        dto.setUserId(userManager.getCurrentUser().getId());
        dto.setBookId(bookId);
        evaluateService.dislike(dto);
        return Result.success();
    }

    @PostMapping("/cancel-like")
    public Result<?> cancelLike(@RequestBody Integer bookId) {
        EvaluateDTO dto = new EvaluateDTO();
        dto.setUserId(userManager.getCurrentUser().getId());
        dto.setBookId(bookId);
        evaluateService.cancelLike(dto);
        return Result.success();
    }
}
