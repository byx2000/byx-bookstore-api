package byx.web.bookstore.mapper;

import byx.web.bookstore.pojo.dto.EvaluateDTO;

public interface EvaluateMapper {
    int countOfLike(EvaluateDTO dto);
    int countOfDislike(EvaluateDTO dto);
}
