package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.pojo.dto.BookClassificationQueryDTO;
import byx.web.bookstore.pojo.dto.BookRankQueryDTO;
import byx.web.bookstore.pojo.dto.BookRecommendQueryDTO;
import byx.web.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/recommend")
    public Result recommend(@RequestBody BookRecommendQueryDTO dto) {
        return Result.success(bookService.getRecommend(dto));
    }

    @PostMapping("/classification")
    public Result classificationQuery(@RequestBody BookClassificationQueryDTO dto) {
        return Result.success(bookService.classificationQuery(dto));
    }

    @PostMapping("/rank")
    public Result rank(@RequestBody BookRankQueryDTO dto) {
        return Result.success(bookService.rankList(dto));
    }
}
