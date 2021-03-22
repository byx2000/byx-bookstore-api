package byx.web.bookstore.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录拦截器
 *
 * @author byx
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        // 未登录则转到ExceptionController
        if (session.getAttribute("currentUser") == null) {
            request.getRequestDispatcher("/exception/no-login").forward(request, response);
            return false;
        }
        return true;
    }
}
