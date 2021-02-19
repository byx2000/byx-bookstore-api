package byx.web.bookstore.common;

/**
 * Json返回结果
 */
public class Result
{
    private final Status status;
    private final Object data;

    /**
     * 获取状态码
     */
    public int getCode()
    {
        return status.getCode();
    }

    /**
     * 获取错误消息
     */
    public String getMessage()
    {
        return status.getMessage();
    }

    /**
     * 获取数据
     */
    public Object getData()
    {
        return data;
    }

    private Result(Status status, Object data)
    {
        this.status = status;
        this.data = data;
    }

    /**
     * 生成成功返回结果
     * @param data 数据
     */
    public static Result success(Object data)
    {
        return new Result(Status.SUCCESS, data);
    }

    /**
     * 生成失败返回结果
     * @param status 状态
     */
    public static Result fail(Status status)
    {
        return new Result(status, null);
    }
}
