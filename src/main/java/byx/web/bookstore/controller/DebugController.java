package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.common.Status;
import byx.web.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用于调试的controller
 */
@RestController
@RequestMapping("/debug")
public class DebugController
{
    @Autowired
    private BookService bookService;

    @RequestMapping("")
    public Result debug()
    {
        return Result.fail(Status.UNKNOWN_ERROR);
    }
}
