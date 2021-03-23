package byx.web.bookstore.service;

import byx.web.bookstore.pojo.dto.ChapterQueryDTO;
import byx.web.bookstore.pojo.vo.ChapterVO;

public interface ChapterService {
    ChapterVO getChapter(ChapterQueryDTO dto);
}
