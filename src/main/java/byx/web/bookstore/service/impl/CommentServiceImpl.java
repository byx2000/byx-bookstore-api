package byx.web.bookstore.service.impl;

import byx.web.bookstore.common.PageInfo;
import byx.web.bookstore.mapper.CommentMapper;
import byx.web.bookstore.pojo.dto.CommentOfBookQueryDTO;
import byx.web.bookstore.pojo.dto.CommentOfUserQueryDTO;
import byx.web.bookstore.pojo.vo.BookCommentVO;
import byx.web.bookstore.pojo.vo.UserCommentVO;
import byx.web.bookstore.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public PageInfo<BookCommentVO> getCommentsOfBook(CommentOfBookQueryDTO dto) {
        List<BookCommentVO> vos = commentMapper.listOfBook(dto);
        int count = commentMapper.countOfBook(dto);
        return new PageInfo<>(vos, dto.getPageSize(), dto.getCurrentPage(), count);
    }

    @Override
    public PageInfo<UserCommentVO> getCommentsOfUser(CommentOfUserQueryDTO dto) {
        List<UserCommentVO> vos = commentMapper.listOfUser(dto);
        int count = commentMapper.countOfUser(dto);
        return new PageInfo<>(vos, dto.getPageSize(), dto.getCurrentPage(), count);
    }
}
