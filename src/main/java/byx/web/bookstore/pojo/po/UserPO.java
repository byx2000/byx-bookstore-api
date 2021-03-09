package byx.web.bookstore.pojo.po;

import byx.web.bookstore.pojo.vo.UserVO;

/**
 * user表对应的实体类
 *
 * @author byx
 */
public class UserPO {
    private Integer id;
    private String username;
    private String password;
    private String nickname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public UserVO toUserVO() {
        UserVO vo = new UserVO();
        vo.setId(id);
        vo.setNickname(nickname);
        vo.setAvatar("http://182.92.74.74:8888/byx-bookstore-api/upload/avatar/" + id + ".jpg");
        return vo;
    }
}
