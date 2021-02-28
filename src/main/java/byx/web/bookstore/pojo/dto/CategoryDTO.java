package byx.web.bookstore.pojo.dto;

/**
 * 传递给客户端的类别信息
 */
public class CategoryDTO
{
    private Integer id;
    private String name;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "CategoryDTO{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
