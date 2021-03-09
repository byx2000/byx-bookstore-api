package byx.web.bookstore.common;

import byx.web.bookstore.pojo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

/**
 * 用户管理
 *
 * @author byx
 */
@Component
public class UserManager {
    @Autowired
    private HttpSession httpSession;

    public void setCurrentUser(UserVO currentUser) {
        httpSession.setAttribute("currentUser", currentUser);
    }

    public UserVO getCurrentUser() {
        return (UserVO) httpSession.getAttribute("currentUser");
    }
}
