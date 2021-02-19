package byx.web.bookstore.mapper;

import byx.web.bookstore.entity.Book;

import java.util.List;

/**
 * 电子书数据访问接口
 */
public interface BookMapper
{
    /**
     * 获取推荐电子书
     * @param count 数量
     */
    List<Book> getRecommend(int count);
}
