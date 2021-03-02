package byx.web.bookstore.pojo.dto;

public class BookRankListQueryDTO {
    private Integer categoryId;
    private Integer count;

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
}
