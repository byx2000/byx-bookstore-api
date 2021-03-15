package byx.web.bookstore.pojo.dto;

import javax.validation.constraints.NotNull;

public class CommentOfUserQueryDTO extends PagingQueryDTO {
    private Integer userId;

    @NotNull(message = "orderType不能为空")
    private String orderType;

    @NotNull(message = "bookKeyword不能为空")
    private String bookKeyword;

    @NotNull(message = "commentKeyword不能为空")
    private String commentKeyword;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getBookKeyword() {
        return bookKeyword;
    }

    public void setBookKeyword(String bookKeyword) {
        this.bookKeyword = bookKeyword;
    }

    public String getCommentKeyword() {
        return commentKeyword;
    }

    public void setCommentKeyword(String commentKeyword) {
        this.commentKeyword = commentKeyword;
    }
}
