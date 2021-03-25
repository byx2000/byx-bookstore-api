package byx.web.bookstore.config;

import byx.web.bookstore.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Spring MVC配置
 *
 * @author byx
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    /**
     * 配置跨域访问
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        WebMvcConfigurer.super.addCorsMappings(registry);
        registry.addMapping("/**")
                .allowedHeaders("*")
                .allowedMethods("*")
                .allowedOriginPatterns("*")
                .allowCredentials(true);
    }

    /**
     * 配置拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 登录拦截器
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/comment/list-of-user",
                        "/comment/publish",
                        "/favorite/query",
                        "/favorite/is-favorite",
                        "/user/current",
                        "/user/logout",
                        "/favorite/add",
                        "/favorite/cancel",
                        "/chapter/query",
                        "/chapter/contents",
                        "/evaluate/is-like");
    }
}