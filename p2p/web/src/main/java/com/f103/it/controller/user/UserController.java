package com.f103.it.controller.user;

import com.f103.it.constant.SystemConstant;
import com.f103.it.controller.BaseController;
import com.f103.it.pojo.User;
import com.f103.it.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping(value="/User")
public class UserController extends BaseController{
    @Autowired
    private IUserService service;

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public Object login(@RequestParam(value="userPhone",required = true) String userPhone,
                        @RequestParam(value="userPassword",required = true) String password, HttpServletRequest request, HttpServletResponse response){
        System.out.println(userPhone);
        System.out.print(password);
    //    HttpSession session = request.getSession();
    //    session.setAttribute("user","user");
    //    String sessionId = session.getId();
     //   Cookie cookie = new Cookie("JSESSIONID",sessionId);
      //  response.addCookie(cookie);
        return getResult(service.login(userPhone,password));
//        System.out.println("---"+session.getId());
//        service.login(userPhone,password);
//        System.out.println(session.getAttribute(SystemConstant.default_user)+"--"+session.getId());
//        return "";
    }

    @RequestMapping(value="/register",method = RequestMethod.POST)
    public Object register(User user){
        service.registerUser(user);
        return getResult("register success");
    }

    @RequestMapping(value="/logout",method = RequestMethod.PUT)
    public Object logout(){
        service.logout();
        return getResult("logout success");
    }

    @RequestMapping(value="/searchUserIP/{userPhone}",method = RequestMethod.GET)
    public Object searchUserIP(@PathVariable(value="userPhone") String userPhone){
        return getResult(service.searchUserIP(userPhone));
    }
    @RequestMapping(value="/{userPhone}",method = RequestMethod.GET)
    public Object getUserInfo(@PathVariable(value="userPhone")String userPhone){
        return getResult(service.searchUserInfo(userPhone));
    }
    @RequestMapping(value="/queryCurrentUserInfo",method = RequestMethod.GET)
    public Object getCurrentUserInfo(){
        return getResult(service.getCurrentUserInfo());
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Object updateUserInfo(@RequestBody User user){
        service.updateUserInfo(user);
        return getResult("update success");
    }
}
