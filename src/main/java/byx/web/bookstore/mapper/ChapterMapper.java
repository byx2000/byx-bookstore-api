package byx.web.bookstore.mapper;

import byx.web.bookstore.pojo.dto.ChapterQueryDTO;
import byx.web.bookstore.pojo.vo.ChapterVO;

public interface ChapterMapper {
    ChapterVO get(ChapterQueryDTO dto);
}
