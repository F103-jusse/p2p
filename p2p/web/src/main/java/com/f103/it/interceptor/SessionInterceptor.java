package com.f103.it.interceptor;

import com.f103.it.constant.SystemConstant;
import com.f103.it.pojo.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

/**
 * session拦截器
 *拦截路径：/**
 *说明：session登陆验证
 */
public class SessionInterceptor implements HandlerInterceptor{
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String uri = httpServletRequest.getRequestURI();
        if(uri.indexOf("login")>=0 || uri.indexOf("register")>=0){
            return true;
        }
      //  System.out.println("请求头-SetCookiee"+httpServletRequest.getHeader("Set-Cookie"));
        System.out.println("请求头-SetCookiee"+httpServletRequest.getHeader("cookie"));
        HttpSession session = httpServletRequest.getSession();
        User currentUser = (User) session.getAttribute(SystemConstant.default_user);
        if(currentUser instanceof User){
            return true;
        }
        httpServletResponse.getWriter().print("登录");
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
    private Set<String> getInterceptPath(){
        Properties pro = new Properties();
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("classpath: a.properties");
        try {
            pro.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String interceptorPath = pro.getProperty("path");
        Set<String> hashSet = new HashSet<String>();
        return hashSet;
    }
}
