package byx.web.bookstore.pojo.po;

import byx.web.bookstore.pojo.dto.CategoryDTO;

/**
 * category表对应的实体类
 *
 * @author byx
 */
public class CategoryPO {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryDTO toCategoryDTO() {
        CategoryDTO dto = new CategoryDTO();
        dto.setId(id);
        dto.setName(name);
        return dto;
    }
}
