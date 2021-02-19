package byx.web.bookstore.mapper;

import byx.web.bookstore.entity.Category;

import java.util.List;

/**
 * 电子书类型数据访问接口
 */
public interface CategoryMapper
{
    /**
     * 获取所有类型
     */
    List<Category> listAll();
}
