package com.f103.it.user;

import com.f103.it.pojo.User;
/**
 * @Project : p2p
 * @Package Name : com.f103.it.user
 * @Description : TODO
 * @Author : 哀建宇
 * @Create Date : 2017年10月24日 11:06
 * @ModificationHistory Who When   What
 */
/**
 * 功能模块：用户管理
 * 模块名称：用户信息管理
 *
 * 业务逻辑列表：
 * 1.登陆；（记录用户登录IP，设置用户在线状态）
 * 2.注册；
 * 3.注销；
 * 4.查询某一在线用户IP；
 * 5.根据电话号码查询个人信息；
 * 6.获取当前用户信息；
 * 7.修改个人信息；
 */
public interface IUserService {
    public String login(String userPhone,String password);

    public void registerUser(User user);

    public void logout();

    public String searchUserIP(String userPhone);

    public User searchUserInfo(String userPhone);

    public User getCurrentUserInfo();

    public void updateUserInfo(User user);
}
