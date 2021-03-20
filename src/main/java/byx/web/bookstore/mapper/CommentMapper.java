package byx.web.bookstore.mapper;

import byx.web.bookstore.pojo.dto.CommentOfBookQueryDTO;
import byx.web.bookstore.pojo.dto.CommentOfUserQueryDTO;
import byx.web.bookstore.pojo.dto.CommentPublishDTO;
import byx.web.bookstore.pojo.vo.BookCommentVO;
import byx.web.bookstore.pojo.vo.UserCommentVO;

import java.util.List;

public interface CommentMapper {
    List<BookCommentVO> listOfBook(CommentOfBookQueryDTO dto);
    int countOfBook(CommentOfBookQueryDTO dto);
    List<UserCommentVO> listOfUser(CommentOfUserQueryDTO dto);
    int countOfUser(CommentOfUserQueryDTO dto);
    void insert(CommentPublishDTO dto);
}
