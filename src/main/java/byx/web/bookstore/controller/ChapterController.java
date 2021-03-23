package byx.web.bookstore.controller;

import byx.web.bookstore.common.Result;
import byx.web.bookstore.pojo.dto.ChapterQueryDTO;
import byx.web.bookstore.pojo.vo.ChapterVO;
import byx.web.bookstore.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chapter")
public class ChapterController {
    @Autowired
    private ChapterService chapterService;

    @PostMapping("/query")
    public Result<ChapterVO> query(@RequestBody @Validated ChapterQueryDTO dto) {
        return Result.success(chapterService.getChapter(dto));
    }
}
