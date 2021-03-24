package byx.web.bookstore.mapper;

import byx.web.bookstore.pojo.dto.LoginDTO;
import byx.web.bookstore.pojo.dto.UserRegisterDTO;
import byx.web.bookstore.pojo.po.UserPO;

public interface UserMapper {
    UserPO getByLoginInfo(LoginDTO dto);
    int countByUsername(String username);
    void insert(UserRegisterDTO dto);
    void deleteById(Integer userId);
}
