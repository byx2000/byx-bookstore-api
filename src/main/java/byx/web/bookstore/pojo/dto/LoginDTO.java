package byx.web.bookstore.pojo.dto;

import javax.validation.constraints.NotNull;

/**
 * 用于在登录过程中传递用户名和密码
 */
public class LoginDTO {
    @NotNull(message = "用户名不能为空")
    private String username;

    @NotNull(message = "密码不能为空")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
