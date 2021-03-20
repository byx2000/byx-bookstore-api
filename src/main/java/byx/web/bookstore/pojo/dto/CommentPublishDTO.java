package byx.web.bookstore.pojo.dto;

import byx.web.bookstore.common.UserManager;

import javax.validation.constraints.NotNull;

public class CommentPublishDTO {
    @NotNull(message = "bookId不能为空")
    private Integer bookId;

    @NotNull(message = "content不能为空")
    private String content;

    private Integer userId;
    private String time;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
