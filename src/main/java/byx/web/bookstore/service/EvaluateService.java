package byx.web.bookstore.service;

import byx.web.bookstore.pojo.dto.EvaluateDTO;

public interface EvaluateService {
    boolean isLike(EvaluateDTO dto);
    boolean isDislike(EvaluateDTO dto);
    void like(EvaluateDTO dto);
    void dislike(EvaluateDTO dto);
    void cancelLike(EvaluateDTO dto);
    void cancelDislike(EvaluateDTO dto);
}
