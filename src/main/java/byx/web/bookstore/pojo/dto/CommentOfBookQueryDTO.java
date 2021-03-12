package byx.web.bookstore.pojo.dto;

import javax.validation.constraints.NotNull;

public class CommentOfBookQueryDTO extends PagingQueryDTO {
    @NotNull(message = "bookId不能为空")
    private Integer bookId;

    private String orderType;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
