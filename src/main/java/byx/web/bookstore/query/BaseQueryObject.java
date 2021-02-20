package byx.web.bookstore.query;

/**
 * 查询对象基类
 * 包含与分页有关的属性
 */
public class BaseQueryObject
{
    private Integer pageSize;
    private Integer currentPage;

    public Integer getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(Integer pageSize)
    {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage()
    {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage)
    {
        this.currentPage = currentPage;
    }

    public Integer getLimit()
    {
        return pageSize;
    }

    public Integer getOffset()
    {
        return pageSize * (currentPage - 1);
    }
}
