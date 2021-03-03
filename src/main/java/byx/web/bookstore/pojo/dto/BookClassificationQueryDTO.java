package byx.web.bookstore.pojo.dto;

import javax.validation.constraints.NotNull;

/**
 * 传递电子书分类查询条件的对象
 * @author byx
 */
public class BookClassificationQueryDTO {
    @NotNull(message = "categoryId不能为空")
    private Integer categoryId;

    @NotNull(message = "pageSize不能为空")
    private Integer pageSize;

    @NotNull(message = "currentPage不能为空")
    private Integer currentPage;

    private RangeDTO scoreRange;
    private RangeDTO heatRange;
    private Integer updateAfter;
    private String orderBy;
    private String orderType;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public RangeDTO getScoreRange() {
        return scoreRange;
    }

    public void setScoreRange(RangeDTO scoreRange) {
        this.scoreRange = scoreRange;
    }

    public RangeDTO getHeatRange() {
        return heatRange;
    }

    public void setHeatRange(RangeDTO heatRange) {
        this.heatRange = heatRange;
    }

    public Integer getUpdateAfter() {
        return updateAfter;
    }

    public void setUpdateAfter(Integer updateAfter) {
        this.updateAfter = updateAfter;
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
        return isPaging() ? pageSize : null;
    }

    public Integer getOffset() {
        return isPaging() ? pageSize * (currentPage - 1) : null;
    }

    private boolean isPaging() {
        return pageSize != null && currentPage != null;
    }
}
