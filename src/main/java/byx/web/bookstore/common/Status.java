package byx.web.bookstore.common;

/**
 * 返回结果状态码
 *
 * @author byx
 */
public enum Status {
    SUCCESS(1001, "操作成功完成"),
    PARAMETER_ERROR(1002, "参数错误"),
    BAD_REQUEST(1003, "请求格式不正确"),
    INTERNAL_ERROR(1004, "服务器内部错误"),
    INCORRECT_USERNAME_OR_PASSWORD(1005, "用户名或密码错误"),
    NOT_LOGGED_IN(1006, "当前未登录"),
    USER_EXIST(1007, "用户已存在"),
    SAVE_AVATAR_FAILED(1008, "保存用户头像失败"),
    CHECK_CODE_ERROR(1009, "验证码错误");

    private final int code;
    private final String msg;

    Status(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
