package byx.web.bookstore.service;

import byx.web.bookstore.pojo.dto.LoginDTO;
import byx.web.bookstore.pojo.dto.UserRegisterDTO;
import byx.web.bookstore.pojo.vo.UserVO;

public interface UserService {
    UserVO login(LoginDTO dto);
    int register(UserRegisterDTO dto);
    void delete(Integer userId);
}
