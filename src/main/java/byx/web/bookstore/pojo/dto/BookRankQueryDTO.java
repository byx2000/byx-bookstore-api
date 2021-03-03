package byx.web.bookstore.pojo.dto;

import javax.validation.constraints.NotNull;

public class BookRankQueryDTO {
    @NotNull(message = "categoryId不能为空")
    private Integer categoryId;

    @NotNull(message = "count不能为空")
    private Integer count;

    @NotNull(message = "type不能为空")
    private String type;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
