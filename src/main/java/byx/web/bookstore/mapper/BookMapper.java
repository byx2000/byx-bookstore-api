package byx.web.bookstore.mapper;

import byx.web.bookstore.entity.Book;
import byx.web.bookstore.query.BookQueryObject;

import java.util.List;

/**
 * 电子书数据访问接口
 */
public interface BookMapper
{
    List<Book> getRecommend(int count);
    List<Book> getRecommendOfCategory(int categoryId, int count);
    List<Book> list(BookQueryObject qo);
}
