package byx.web.bookstore.pojo.dto;

public class BookClassificationQueryDTO extends PagingQueryDTO {
    private Integer categoryId;
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
}
