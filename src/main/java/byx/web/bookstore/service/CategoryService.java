package byx.web.bookstore.service;

import byx.web.bookstore.pojo.dto.CategoryDTO;

import java.util.List;

/**
 * 电子书类型服务接口
 */
public interface CategoryService
{
    /**
     * 获取所有电子书类型
     */
    List<CategoryDTO> all();

    /**
     * 根据id获取类型信息
     * @param categoryId 类型id
     */
    CategoryDTO get(Integer categoryId);
}
