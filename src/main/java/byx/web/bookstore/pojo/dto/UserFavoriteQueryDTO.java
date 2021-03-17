package byx.web.bookstore.pojo.dto;

import javax.validation.constraints.NotNull;

public class UserFavoriteQueryDTO extends PagingQueryDTO {
    private Integer userId;

    @NotNull(message = "bookKeyword不能为空")
    private String bookKeyword;

    @NotNull(message = "authorKeyword不能为空")
    private String authorKeyword;

    @NotNull(message = "orderType不能为空")
    private String orderType;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBookKeyword() {
        return bookKeyword;
    }

    public void setBookKeyword(String bookKeyword) {
        this.bookKeyword = bookKeyword;
    }

    public String getAuthorKeyword() {
        return authorKeyword;
    }

    public void setAuthorKeyword(String authorKeyword) {
        this.authorKeyword = authorKeyword;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
