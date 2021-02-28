package byx.web.bookstore.service.impl;

import byx.web.bookstore.common.PageInfo;
import byx.web.bookstore.mapper.BookMapper;
import byx.web.bookstore.pojo.dto.BookClassificationQueryDTO;
import byx.web.bookstore.pojo.po.BookPO;
import byx.web.bookstore.pojo.vo.BookItemVO;
import byx.web.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService
{
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<BookItemVO> recommend(Integer count)
    {
        List<BookPO> pos = bookMapper.listRecommend(count);
        return pos.stream().map(BookPO::toBookItemVO).collect(Collectors.toList());
    }

    @Override
    public List<BookItemVO> recommendOfCategory(Integer categoryId, Integer count)
    {
        List<BookPO> pos = bookMapper.listRecommendByCategoryId(categoryId, count);
        return pos.stream().map(BookPO::toBookItemVO).collect(Collectors.toList());
    }

    @Override
    public PageInfo<BookItemVO> classificationQuery(BookClassificationQueryDTO qo)
    {
        List<BookItemVO> vos =  bookMapper.listClassificationQueryResult(qo).stream().map(BookPO::toBookItemVO).collect(Collectors.toList());
        int count = bookMapper.countOfClassificationQueryResult(qo);
        return new PageInfo<>(vos, qo.getPageSize(), qo.getCurrentPage(), count);
    }
}
