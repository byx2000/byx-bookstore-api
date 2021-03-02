package byx.web.bookstore.pojo.vo;

/**
 * 返回给客户端的电子书信息
 * @author byx
 */
public class BookItemVO {
    private String name;
    private String author;
    private String description;
    private Double score;
    private Integer heat;
    private String cover;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getHeat() {
        return heat;
    }

    public void setHeat(Integer heat) {
        this.heat = heat;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "BookItemVO{" + "name='" + name + '\'' + ", author='" + author + '\'' + ", description='" + description + '\'' + ", score=" + score + ", heat=" + heat + ", cover='" + cover + '\'' + '}';
    }
}
