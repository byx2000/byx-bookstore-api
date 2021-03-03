package byx.web.bookstore.service;

import byx.web.bookstore.common.PageInfo;
import byx.web.bookstore.pojo.dto.BookClassificationQueryDTO;
import byx.web.bookstore.pojo.dto.BookRankQueryDTO;
import byx.web.bookstore.pojo.dto.BookRecommendQueryDTO;
import byx.web.bookstore.pojo.vo.BookItemVO;

import java.util.List;

public interface BookService {
    List<BookItemVO> getRecommend(BookRecommendQueryDTO dto);
    PageInfo<BookItemVO> classificationQuery(BookClassificationQueryDTO dto);
    List<BookItemVO> getRank(BookRankQueryDTO dto);
}
