package byx.web.bookstore.mapper;

import byx.web.bookstore.pojo.dto.EvaluateDTO;
import org.apache.ibatis.annotations.Param;

public interface EvaluateMapper {
    int count(EvaluateDTO dto);
    int countOfLike(EvaluateDTO dto);
    int countOfDislike(EvaluateDTO dto);
    void insert(EvaluateDTO dto, Integer state);
    void update(EvaluateDTO dto, Integer state);
}
