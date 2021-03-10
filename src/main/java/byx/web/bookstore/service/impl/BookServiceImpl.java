package byx.web.bookstore.service.impl;

import byx.web.bookstore.common.PageInfo;
import byx.web.bookstore.mapper.BookMapper;
import byx.web.bookstore.pojo.dto.BookClassificationQueryDTO;
import byx.web.bookstore.pojo.dto.BookKeywordSearchDTO;
import byx.web.bookstore.pojo.dto.BookRankQueryDTO;
import byx.web.bookstore.pojo.dto.BookRecommendQueryDTO;
import byx.web.bookstore.pojo.po.BookPO;
import byx.web.bookstore.pojo.vo.BookItemVO;
import byx.web.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<BookItemVO> getRecommend(BookRecommendQueryDTO dto) {
        List<BookPO> pos = bookMapper.listByRecommendQuery(dto);
        return pos.stream().map(BookPO::toBookItemVO).collect(Collectors.toList());
    }

    @Override
    public PageInfo<BookItemVO> classificationQuery(BookClassificationQueryDTO dto) {
        List<BookItemVO> vos = bookMapper.listByClassificationQuery(dto).stream().map(BookPO::toBookItemVO).collect(Collectors.toList());
        int count = bookMapper.countByClassificationQuery(dto);
        return new PageInfo<>(vos, dto.getPageSize(), dto.getCurrentPage(), count);
    }

    @Override
    public List<BookItemVO> getRank(BookRankQueryDTO dto) {
        List<BookPO> pos = bookMapper.listRank(dto);
        return pos.stream().map(BookPO::toBookItemVO).collect(Collectors.toList());
    }

    @Override
    public PageInfo<BookItemVO> keywordSearch(BookKeywordSearchDTO dto) {
        List<BookItemVO> vos = bookMapper.listByKeywordSearch(dto).stream().map(BookPO::toBookItemVO).collect(Collectors.toList());
        int count = bookMapper.countByKeywordSearch(dto);
        return new PageInfo<>(vos, dto.getPageSize(), dto.getCurrentPage(), count);
    }

    @Override
    public BookItemVO getBookDetail(Integer bookId) {
        return bookMapper.getById(bookId).toBookItemVO();
    }
}
