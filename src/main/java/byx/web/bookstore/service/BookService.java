package byx.web.bookstore.service;

import byx.web.bookstore.entity.Book;
import byx.web.bookstore.query.BookQueryObject;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 电子书服务接口
 */
@Service
public interface BookService
{
    /**
     * 获取推荐电子书
     * @param count 数量
     */
    List<Book> recommend(int count);

    /**
     * 获取指定类型的推荐电子书
     * @param categoryId 类型id
     * @param count 数量
     */
    List<Book> recommendOfCategory(int categoryId, int count);

    List<Book> query(BookQueryObject qo);
}
