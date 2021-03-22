package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.pojo.dto.CategoryDTO;
import byx.web.bookstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 电子书类型控制器
 * @author byx
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/all")
    public Result<List<CategoryDTO>> all() {
        return Result.success(categoryService.all());
    }

    @RequestMapping("")
    public Result<CategoryDTO> query(@RequestBody Integer categoryId) {
        return Result.success(categoryService.get(categoryId));
    }
}
