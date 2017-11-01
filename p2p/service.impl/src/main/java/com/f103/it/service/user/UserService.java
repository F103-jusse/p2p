package com.f103.it.service.user;

import com.f103.it.constant.SystemConstant;
import com.f103.it.constant.SystemConstant.LoginResult;
import com.f103.it.pojo.User;
import com.f103.it.user.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

@Service("IUservice")
public class UserService extends BaseService implements IUserService {
    @Transactional(readOnly = true)
    public String login(String userPhone,String userPassword) {
        User user = mapper.selectUserByUserPhone(userPhone);
        String result = "";
        if(user==null){
            result = LoginResult.userNull.getValue();
        }else{
            if(!user.getUserPassword().equals(userPassword)){
                result = LoginResult.passwordError.getValue();
            }else{ //登陆成功
                session.setAttribute(SystemConstant.default_user,user); //保存至session中
                result = LoginResult.success.getValue();
            }
        }
        session.setMaxInactiveInterval(30*60);
        System.out.println(session.getAttribute(SystemConstant.default_user)+"--"+session.getId());
        return result;
    }

    public void registerUser(User user) {
        //完善user注册信息
        user.setUserRegisterTime(new Timestamp(System.currentTimeMillis()));
        user.setUserStatus(SystemConstant.userStatus.register.getValue());

        mapper.insert(user);
    }

    public void logout() {
        session.invalidate();
        //mapper.logout(user.getUserphone());
    }
    @Transactional(readOnly = true)
    public String searchUserIP(String userPhone) {
        return mapper.selectUserIP(userPhone);
    }
    @Transactional(readOnly = true)
    public User searchUserInfo(String userPhone) {
        return mapper.selectUserByUserPhone(userPhone);
    }

    public User getCurrentUserInfo() {
        User currentUser = (User) session.getAttribute(SystemConstant.default_user);
        currentUser.setUserId(-1);
        return currentUser;
    }

    public void updateUserInfo(User user) {
        mapper.updateByPrimaryKeySelective(user);
    }
}
