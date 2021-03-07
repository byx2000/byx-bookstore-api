package byx.web.bookstore.pojo.dto;

import javax.validation.constraints.NotNull;

public class PagingQueryDTO {
    @NotNull(message = "pageSize不能为空")
    private Integer pageSize;

    @NotNull(message = "currentPage不能为空")
    private Integer currentPage;

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
