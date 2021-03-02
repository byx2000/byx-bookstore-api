package byx.web.bookstore.service.impl;

import byx.web.bookstore.pojo.dto.CategoryDTO;
import byx.web.bookstore.pojo.po.CategoryPO;
import byx.web.bookstore.mapper.CategoryMapper;
import byx.web.bookstore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * CategoryService实现类
 *
 * @author byx
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<CategoryDTO> all() {
        return categoryMapper.listAll().stream().map(CategoryPO::toCategoryDTO).collect(Collectors.toList());
    }

    @Override
    public CategoryDTO get(Integer categoryId) {
        return categoryMapper.getById(categoryId).toCategoryDTO();
    }
}
