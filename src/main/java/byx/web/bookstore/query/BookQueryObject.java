package byx.web.bookstore.query;

import byx.web.bookstore.common.Range;

/**
 * 电子书查询对象
 */
public class BookQueryObject extends BaseQueryObject
{
    private Integer categoryId;
    private Range scoreRange = new Range();
    private Range heatRange = new Range();
    private Integer updateAfter;
    private String orderBy;
    private String orderType;

    public Integer getCategoryId()
    {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId)
    {
        this.categoryId = categoryId;
    }

    public Range getScoreRange()
    {
        return scoreRange;
    }

    public void setScoreRange(Range scoreRange)
    {
        this.scoreRange = scoreRange;
    }

    public Range getHeatRange()
    {
        return heatRange;
    }

    public void setHeatRange(Range heatRange)
    {
        this.heatRange = heatRange;
    }

    public Integer getUpdateAfter()
    {
        return updateAfter;
    }

    public void setUpdateAfter(Integer updateAfter)
    {
        this.updateAfter = updateAfter;
    }

    public String getOrderBy()
    {
        return orderBy;
    }

    public void setOrderBy(String orderBy)
    {
        this.orderBy = orderBy;
    }

    public String getOrderType()
    {
        return orderType;
    }

    public void setOrderType(String orderType)
    {
        this.orderType = orderType;
    }
}
