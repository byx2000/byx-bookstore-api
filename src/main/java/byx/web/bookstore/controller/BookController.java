package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.common.Status;
import byx.web.bookstore.entity.Book;
import byx.web.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController
{
    @Autowired
    private BookService bookService;

    @RequestMapping("/recommend")
    public Result getRecommend(Integer count)
    {
        if (count == null) return Result.fail(Status.PARAMETER_MISS("count"));

        List<Book> books = bookService.getRecommend(count);
        for (Book b : books)
        {
            b.setCover("http://182.92.74.74:8888/byx-bookstore-api/upload/cover/" + b.getId() + ".jpg");
        }

        return Result.success(books);
    }
}
