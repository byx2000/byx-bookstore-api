package byx.web.bookstore.entity;

/**
 * 电子书实体类
 */
public class Book
{
    private Integer id;
    private Integer categoryId;
    private String name;
    private String author;
    private String description;
    private String updateTime;
    private Integer wordCount;
    private Integer likeCount;
    private Integer dislikeCount;
    private Integer heat;
    private Double score;
    private String cover;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getCategoryId()
    {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId)
    {
        this.categoryId = categoryId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(String updateTime)
    {
        this.updateTime = updateTime;
    }

    public Integer getWordCount()
    {
        return wordCount;
    }

    public void setWordCount(Integer wordCount)
    {
        this.wordCount = wordCount;
    }

    public Integer getLikeCount()
    {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount)
    {
        this.likeCount = likeCount;
    }

    public Integer getDislikeCount()
    {
        return dislikeCount;
    }

    public void setDislikeCount(Integer dislikeCount)
    {
        this.dislikeCount = dislikeCount;
    }

    public Integer getHeat()
    {
        return heat;
    }

    public void setHeat(Integer heat)
    {
        this.heat = heat;
    }

    public Double getScore()
    {
        return score;
    }

    public void setScore(Double score)
    {
        this.score = score;
    }

    public String getCover()
    {
        return cover;
    }

    public void setCover(String cover)
    {
        this.cover = cover;
    }
}
