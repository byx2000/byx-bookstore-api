package byx.web.bookstore.pojo.dto;

/**
 * 电子书推荐查询请求对象
 * @author byx
 */
public class BookRecommendQueryDTO {
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
