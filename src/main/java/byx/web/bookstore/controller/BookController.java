package byx.web.bookstore.controller;

import byx.web.bookstore.common.PageInfo;
import byx.web.bookstore.common.Result;
import byx.web.bookstore.pojo.dto.*;
import byx.web.bookstore.pojo.vo.BookItemVO;
import byx.web.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 电子书控制器
 *
 * @author byx
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/recommend")
    public Result<List<BookItemVO>> recommend(@RequestBody @Validated BookRecommendQueryDTO dto) {
        return Result.success(bookService.getRecommend(dto));
    }

    @PostMapping("/classification")
    public Result<PageInfo<BookItemVO>> classificationQuery(@RequestBody @Validated BookClassificationQueryDTO dto) {
        return Result.success(bookService.classificationQuery(dto));
    }

    @PostMapping("/rank")
    public Result<List<BookItemVO>> rank(@RequestBody @Validated BookRankQueryDTO dto) {
        return Result.success(bookService.getRank(dto));
    }

    @PostMapping("/search")
    public Result<PageInfo<BookItemVO>> keywordSearch(@RequestBody @Validated BookKeywordSearchDTO dto) {
        return Result.success(bookService.keywordSearch(dto));
    }

    @PostMapping("/detail")
    public Result<BookItemVO> detail(@RequestBody Integer bookId) {
        return Result.success(bookService.getBookDetail(bookId));
    }
}
