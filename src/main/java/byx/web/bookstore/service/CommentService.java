package byx.web.bookstore.service;

import byx.web.bookstore.common.PageInfo;
import byx.web.bookstore.pojo.dto.CommentOfBookQueryDTO;
import byx.web.bookstore.pojo.vo.CommentVO;

public interface CommentService {
    PageInfo<CommentVO> getCommentsOfBook(CommentOfBookQueryDTO dto);
}
