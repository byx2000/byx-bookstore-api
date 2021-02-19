package byx.web.bookstore.service.impl;

import byx.web.bookstore.entity.Category;
import byx.web.bookstore.mapper.CategoryMapper;
import byx.web.bookstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService
{
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> all()
    {
        return categoryMapper.listAll();
    }
}
