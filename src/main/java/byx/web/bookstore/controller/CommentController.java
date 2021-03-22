package byx.web.bookstore.controller;

import byx.web.bookstore.common.PageInfo;
import byx.web.bookstore.common.Result;
import byx.web.bookstore.common.UserManager;
import byx.web.bookstore.pojo.dto.CommentOfBookQueryDTO;
import byx.web.bookstore.pojo.dto.CommentOfUserQueryDTO;
import byx.web.bookstore.pojo.dto.CommentPublishDTO;
import byx.web.bookstore.pojo.vo.BookCommentVO;
import byx.web.bookstore.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @Autowired
    private UserManager userManager;

    @PostMapping("/list-of-book")
    public Result<PageInfo<BookCommentVO>> listOfBook(@RequestBody @Validated CommentOfBookQueryDTO dto) {
        return Result.success(commentService.getCommentsOfBook(dto));
    }

    @PostMapping("/list-of-user")
    public Result<?> listOfUser(@RequestBody @Validated CommentOfUserQueryDTO dto) {
        dto.setUserId(userManager.getCurrentUser().getId());
        return Result.success(commentService.getCommentsOfUser(dto));
    }

    @PostMapping("/publish")
    public Result<?> publish(@RequestBody @Validated CommentPublishDTO dto) {
        dto.setUserId(userManager.getCurrentUser().getId());
        commentService.publish(dto);
        return Result.success();
    }
}
