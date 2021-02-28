package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.common.Status;
import byx.web.bookstore.pojo.dto.BookClassificationQueryDTO;
import byx.web.bookstore.pojo.dto.BookRecommendQueryDTO;
import byx.web.bookstore.pojo.vo.BookItemVO;
import byx.web.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 电子书控制器
 */
@RestController
@RequestMapping("/book")
public class BookController
{
    @Autowired
    private BookService bookService;

    /**
     * 获取电子书推荐列表
     */
    @PostMapping("/recommend")
    public Result recommend(@RequestBody BookRecommendQueryDTO dto)
    {
        if (dto.getCount() == null) return Result.fail(Status.PARAMETER_MISS("count"));

        List<BookItemVO> vos;
        if (dto.getCategoryId() == null)
            vos = bookService.recommend(dto.getCount());
        else
            vos = bookService.recommendOfCategory(dto.getCategoryId(), dto.getCount());

        return Result.success(vos);
    }

    @PostMapping("/classification")
    public Result classificationQuery(@RequestBody BookClassificationQueryDTO dto)
    {
        return Result.success(bookService.classificationQuery(dto));
    }
}
