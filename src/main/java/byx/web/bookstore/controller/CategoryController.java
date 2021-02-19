package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 电子书类型控制器
 */
@RestController
@RequestMapping("/category")
public class CategoryController
{
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/all")
    public Result all()
    {
        return Result.success(categoryService.all());
    }
}
