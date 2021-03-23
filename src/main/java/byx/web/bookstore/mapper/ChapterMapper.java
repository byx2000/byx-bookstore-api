package byx.web.bookstore.mapper;

import byx.web.bookstore.pojo.dto.ChapterQueryDTO;
import byx.web.bookstore.pojo.vo.ChapterVO;
import byx.web.bookstore.pojo.vo.ContentItemVO;

import java.util.List;

public interface ChapterMapper {
    ChapterVO get(ChapterQueryDTO dto);
    List<ContentItemVO> listContents(Integer bookId);
}
