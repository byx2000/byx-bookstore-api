package byx.web.bookstore.service;

import byx.web.bookstore.pojo.dto.ChapterQueryDTO;
import byx.web.bookstore.pojo.vo.ChapterVO;
import byx.web.bookstore.pojo.vo.ContentItemVO;

import java.util.List;

public interface ChapterService {
    ChapterVO getChapter(ChapterQueryDTO dto);
    List<ContentItemVO> getContents(Integer bookId);
}
