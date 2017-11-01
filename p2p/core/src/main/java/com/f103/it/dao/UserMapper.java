package com.f103.it.dao;

import com.f103.it.pojo.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 根据手机号查询用户
     * @param userPhone
     * @return User
     */
    User selectUserByUserPhone(@Param(value = "userPhone") String userPhone);

    /**
     * 根据手机号查询用户的在线IP
     * @param userPhone
     * @return String
     */
    String selectUserIP(@Param(value = "userPhone") String userPhone);


}