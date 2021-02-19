package byx.web.bookstore.service;

import byx.web.bookstore.entity.Category;

import java.util.List;

/**
 * 电子书类型服务接口
 */
public interface CategoryService
{
    /**
     * 获取所有电子书类型
     */
    List<Category> all();
}
