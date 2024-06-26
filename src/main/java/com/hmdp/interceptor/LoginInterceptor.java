package com.hmdp.interceptor;

import com.hmdp.dto.UserDTO;
import com.hmdp.entity.User;
import com.hmdp.utils.UserHolder;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 囍崽
 * version 1.0
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取session
        //HttpSession session = request.getSession();
        //获取session中的用户
        //Object user = session.getAttribute("User");
        //判断用户是否存在
        //if (user == null){
            //不存在，拦截，返回401 状态码
            //response.setStatus(401);
            //return false;
        //}
        //存在，保存用户信息到threadlocal
        //UserHolder.saveUser((UserDTO) user);
        //放行

        //1. 判断是否需要拦截(threadLocal 中是否有用户)
        if (UserHolder.getUser() == null){
            //没有，需要拦截,设置状态码
            response.setStatus(401);
            //拦截
            return false;
        }
        //有用户，则放行
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        UserHolder.removeUser();
    }
}
