package byx.web.bookstore.mapper;

import byx.web.bookstore.pojo.dto.LoginDTO;
import byx.web.bookstore.pojo.po.UserPO;

public interface UserMapper {
    UserPO getByLoginInfo(LoginDTO dto);
}
