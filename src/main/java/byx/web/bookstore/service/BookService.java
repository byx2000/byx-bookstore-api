package byx.web.bookstore.service;

import byx.web.bookstore.common.PageInfo;
import byx.web.bookstore.pojo.dto.BookClassificationQueryDTO;
import byx.web.bookstore.pojo.vo.BookItemVO;

import java.util.List;

/**
 * 电子书服务接口
 */
public interface BookService
{
    /**
     * 获取推荐电子书
     * @param count 数量
     */
    List<BookItemVO> recommend(Integer count);

    /**
     * 获取指定类型的推荐电子书
     * @param categoryId 类型id
     * @param count 数量
     */
    List<BookItemVO> recommendOfCategory(Integer categoryId, Integer count);

    /**
     * 分类查询电子书
     * @param qo 查询条件
     */
    PageInfo<BookItemVO> classificationQuery(BookClassificationQueryDTO qo);
}
