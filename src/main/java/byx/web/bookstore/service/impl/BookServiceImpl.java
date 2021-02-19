package byx.web.bookstore.service.impl;

import byx.web.bookstore.entity.Book;
import byx.web.bookstore.mapper.BookMapper;
import byx.web.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getRecommend(int count)
    {
        return bookMapper.getRecommend(count);
    }
}
