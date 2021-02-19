package byx.web.bookstore.service;

import byx.web.bookstore.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService
{
    List<Book> getRecommend(int count);
}
