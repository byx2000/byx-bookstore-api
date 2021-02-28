package byx.web.bookstore.mapper;

import byx.web.bookstore.pojo.po.CategoryPO;

import java.util.List;

/**
 * 电子书类型数据访问接口
 */
public interface CategoryMapper
{
    /**
     * 获取所有类型
     */
    List<CategoryPO> listAll();

    /**
     * 根据id查询类型信息
     * @param id 类型id
     */
    CategoryPO getById(Integer id);
}
