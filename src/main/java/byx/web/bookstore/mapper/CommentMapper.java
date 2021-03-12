package byx.web.bookstore.mapper;

import byx.web.bookstore.pojo.dto.CommentOfBookQueryDTO;
import byx.web.bookstore.pojo.vo.CommentVO;

import java.util.List;

public interface CommentMapper {
    List<CommentVO> listOfBook(CommentOfBookQueryDTO dto);
    int countOfBook(CommentOfBookQueryDTO dto);
}
