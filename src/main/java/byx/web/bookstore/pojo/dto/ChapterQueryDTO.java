package byx.web.bookstore.pojo.dto;

import javax.validation.constraints.NotNull;

public class ChapterQueryDTO {
    @NotNull(message = "bookId不能为空")
    private Integer bookId;

    @NotNull(message = "chapter不能为空")
    private Integer chapter;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getChapter() {
        return chapter;
    }

    public void setChapter(Integer chapter) {
        this.chapter = chapter;
    }
}
