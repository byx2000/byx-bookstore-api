package byx.web.bookstore.pojo.dto;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class RegisterRequestDTO {
    @NotNull(message = "username不能为空")
    @NotEmpty(message = "username不能为空")
    private String username;

    @NotNull(message = "nickname不能为空")
    @NotEmpty(message = "nickname不能为空")
    private String nickname;

    @NotNull(message = "password不能为空")
    @NotEmpty(message = "password不能为空")
    private String password;

    @NotNull(message = "avatar不能为空")
    private MultipartFile avatar;

    @NotNull(message = "checkCode不能为空")
    @NotEmpty(message = "checkCode不能为空")
    private String checkCode;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MultipartFile getAvatar() {
        return avatar;
    }

    public void setAvatar(MultipartFile avatar) {
        this.avatar = avatar;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }
}
