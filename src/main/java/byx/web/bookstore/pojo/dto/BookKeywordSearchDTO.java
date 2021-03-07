package byx.web.bookstore.pojo.dto;

import javax.validation.constraints.NotNull;

public class BookKeywordSearchDTO extends PagingQueryDTO {
    @NotNull(message = "keyword不能为空")
    private String keyword;

    @NotNull(message = "orderBy不能为空")
    private String orderBy;

    @NotNull(message = "orderType不能为空")
    private String orderType;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
