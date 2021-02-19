package byx.web.bookstore.mapper;

import byx.web.bookstore.entity.Book;

import java.util.List;

public interface BookMapper
{
    /**
     * 获取推荐电子书
     * @param count 数量
     */
    List<Book> getRecommend(int count);
}
