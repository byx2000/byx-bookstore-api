package byx.web.bookstore.mapper;

import byx.web.bookstore.pojo.dto.BookClassificationQueryDTO;
import byx.web.bookstore.pojo.dto.BookKeywordSearchDTO;
import byx.web.bookstore.pojo.dto.BookRankQueryDTO;
import byx.web.bookstore.pojo.dto.BookRecommendQueryDTO;
import byx.web.bookstore.pojo.po.BookPO;

import java.util.List;

public interface BookMapper {
    List<BookPO> listByRecommendQuery(BookRecommendQueryDTO dto);
    List<BookPO> listByClassificationQuery(BookClassificationQueryDTO dto);
    int countByClassificationQuery(BookClassificationQueryDTO dto);
    List<BookPO> listRank(BookRankQueryDTO dto);
    List<BookPO> listByKeywordSearch(BookKeywordSearchDTO dto);
    int countByKeywordSearch(BookKeywordSearchDTO dto);
    BookPO getById(Integer bookId);
}
