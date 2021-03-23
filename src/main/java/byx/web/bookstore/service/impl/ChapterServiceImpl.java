package byx.web.bookstore.service.impl;

import byx.web.bookstore.mapper.ChapterMapper;
import byx.web.bookstore.pojo.dto.ChapterQueryDTO;
import byx.web.bookstore.pojo.vo.ChapterVO;
import byx.web.bookstore.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChapterServiceImpl implements ChapterService {
    @Autowired
    private ChapterMapper chapterMapper;

    @Override
    public ChapterVO getChapter(ChapterQueryDTO dto) {
        return chapterMapper.get(dto);
    }
}
