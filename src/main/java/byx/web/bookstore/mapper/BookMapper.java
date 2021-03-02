package byx.web.bookstore.mapper;

import byx.web.bookstore.pojo.dto.BookClassificationQueryDTO;
import byx.web.bookstore.pojo.po.BookPO;

import java.util.List;

/**
 * 电子书数据访问接口
 */
public interface BookMapper {
    /**
     * 获取推荐列表
     *
     * @param count 数量
     */
    List<BookPO> listRecommend(Integer count);

    /**
     * 获取指定类别的推荐列表
     *
     * @param categoryId 类型id
     * @param count      数量
     */
    List<BookPO> listRecommendByCategoryId(Integer categoryId, Integer count);

    /**
     * 获取分类查询列表
     *
     * @param qo 查询条件
     */
    List<BookPO> listClassificationQueryResult(BookClassificationQueryDTO qo);

    /**
     * 获取分类查询的结果总数
     *
     * @param qo 查询条件
     */
    int countOfClassificationQueryResult(BookClassificationQueryDTO qo);

    //List<BookPO> listRank()
}
