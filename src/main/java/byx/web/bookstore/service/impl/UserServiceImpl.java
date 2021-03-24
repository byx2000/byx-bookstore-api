package byx.web.bookstore.service.impl;

import byx.web.bookstore.common.Status;
import byx.web.bookstore.exception.BizException;
import byx.web.bookstore.mapper.UserMapper;
import byx.web.bookstore.pojo.dto.LoginDTO;
import byx.web.bookstore.pojo.dto.UserRegisterDTO;
import byx.web.bookstore.pojo.po.UserPO;
import byx.web.bookstore.pojo.vo.UserVO;
import byx.web.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserVO login(LoginDTO dto) {
        UserPO po = userMapper.getByLoginInfo(dto);
        // 用户名或密码错误
        if (po == null) {
            throw new BizException(Status.INCORRECT_USERNAME_OR_PASSWORD, dto);
        }
        return po.toUserVO();
    }

    @Override
    public int register(UserRegisterDTO dto) {
        if (userMapper.countByUsername(dto.getUsername()) > 0) {
            throw new BizException(Status.USER_EXIST, dto.getUsername());
        }
        userMapper.insert(dto);
        return dto.getId();
    }

    @Override
    public void delete(Integer userId) {
        userMapper.deleteById(userId);
    }
}
