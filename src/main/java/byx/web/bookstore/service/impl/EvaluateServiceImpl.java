package byx.web.bookstore.service.impl;

import byx.web.bookstore.mapper.EvaluateMapper;
import byx.web.bookstore.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluateServiceImpl implements EvaluateService {
    @Autowired
    private EvaluateMapper evaluateMapper;

    @Override
    public boolean isLike(Integer userId, Integer bookId) {
        return evaluateMapper.countOfLike(userId, bookId) > 0;
    }
}
