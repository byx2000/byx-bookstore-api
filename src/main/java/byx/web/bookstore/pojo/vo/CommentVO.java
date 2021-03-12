package byx.web.bookstore.pojo.vo;

/**
 * 返回给客户端的评论展示信息
 *
 * @author byx
 */
public class CommentVO {
    private String content;
    private String time;
    private String username;
    private Integer userId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getAvatar() {
        return "http://182.92.74.74:8888/byx-bookstore-api/upload/avatar/" + userId + ".jpg";
    }
}
