package byx.web.bookstore.common;

/**
 * Json返回状态
 * @author byx
 */
public class Status {
    private final int code;
    private final String message;

    private Status(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static Status SUCCESS = new Status(200, "操作成功完成");

    public static Status parameterMiss(String requiredParameter) {
        return new Status(201, "缺少参数：" + requiredParameter);
    }

    public static Status UNKNOWN_ERROR = new Status(300, "未知错误");
}
