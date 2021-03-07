package byx.web.bookstore.pojo.dto;

import javax.validation.constraints.NotNull;

public class BookKeywordSearchDTO {
    @NotNull(message = "keyword不能为空")
    private String keyword;

    @NotNull(message = "orderBy不能为空")
    private String orderBy;

    @NotNull(message = "orderType不能为空")
    private String orderType;

    @NotNull(message = "pageSize不能为空")
    private Integer pageSize;

    @NotNull(message = "currentPage不能为空")
    private Integer currentPage;

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

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public Integer getLimit() {
        return pageSize;
    }

    public Integer getOffset() {
        return pageSize * (currentPage - 1);
    }
}
