package byx.web.bookstore.service;

import byx.web.bookstore.common.PageInfo;
import byx.web.bookstore.pojo.dto.CommentOfBookQueryDTO;
import byx.web.bookstore.pojo.dto.CommentOfUserQueryDTO;
import byx.web.bookstore.pojo.vo.BookCommentVO;
import byx.web.bookstore.pojo.vo.UserCommentVO;

public interface CommentService {
    PageInfo<BookCommentVO> getCommentsOfBook(CommentOfBookQueryDTO dto);
    PageInfo<UserCommentVO> getCommentsOfUser(CommentOfUserQueryDTO dto);
}
