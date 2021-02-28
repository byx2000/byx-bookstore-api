package byx.web.bookstore.pojo.dto;

/**
 * 范围
 */
public class RangeDTO
{
    private Integer min, max;

    public Integer getMin()
    {
        return min;
    }

    public void setMin(Integer min)
    {
        this.min = min;
    }

    public Integer getMax()
    {
        return max;
    }

    public void setMax(Integer max)
    {
        this.max = max;
    }

    @Override
    public String toString()
    {
        return "Range{" + "min=" + min + ", max=" + max + '}';
    }
}
