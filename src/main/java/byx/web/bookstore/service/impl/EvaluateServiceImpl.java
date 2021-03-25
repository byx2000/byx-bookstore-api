package byx.web.bookstore.service.impl;

import byx.web.bookstore.mapper.BookMapper;
import byx.web.bookstore.mapper.EvaluateMapper;
import byx.web.bookstore.pojo.dto.EvaluateDTO;
import byx.web.bookstore.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EvaluateServiceImpl implements EvaluateService {
    @Autowired
    private EvaluateMapper evaluateMapper;

    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean isLike(EvaluateDTO dto) {
        return evaluateMapper.countOfLike(dto) > 0;
    }

    @Override
    public boolean isDislike(EvaluateDTO dto) {
        return evaluateMapper.countOfDislike(dto) > 0;
    }

    @Override
    public void like(EvaluateDTO dto) {
        if (evaluateMapper.count(dto) > 0) {
            if (evaluateMapper.countOfDislike(dto) > 0) {
                evaluateMapper.update(dto, 0);
                bookMapper.increaseLikeCount(dto.getBookId());
                bookMapper.decreaseDislikeCount(dto.getBookId());
            }
        } else {
            evaluateMapper.insert(dto, 0);
            bookMapper.increaseLikeCount(dto.getBookId());
        }
    }

    @Override
    public void dislike(EvaluateDTO dto) {
        if (evaluateMapper.count(dto) > 0) {
            if (evaluateMapper.countOfLike(dto) > 0) {
                evaluateMapper.update(dto, 1);
                bookMapper.decreaseLikeCount(dto.getBookId());
                bookMapper.increaseDislikeCount(dto.getBookId());
            }
        } else {
            evaluateMapper.insert(dto, 1);
            bookMapper.increaseDislikeCount(dto.getBookId());
        }
    }
}
