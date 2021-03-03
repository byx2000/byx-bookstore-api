package byx.web.bookstore.pojo.dto;

import javax.validation.constraints.NotNull;

/**
 * 电子书推荐查询请求对象
 * @author byx
 */
public class BookRecommendQueryDTO {

    @NotNull(message = "count不能为空")
    private Integer count;

    private Integer categoryId;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
