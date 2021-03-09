package byx.web.bookstore.pojo.vo;

/**
 * 返回给客户端的用户信息
 *
 * @author byx
 */
public class UserVO {
    private Integer id;
    private String nickname;
    private String avatar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
