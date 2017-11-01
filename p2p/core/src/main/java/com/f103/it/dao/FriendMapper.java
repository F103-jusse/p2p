package com.f103.it.dao;

import com.f103.it.pojo.Friend;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FriendMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Friend record);

    int insertSelective(Friend record);

    Friend selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Friend record);

    int updateByPrimaryKey(Friend record);

    /**
     *  查询电话号1与电话号2是否为好友关系
     * @param userPhone1
     * @param userPhone2
     * @return List<Friend>
     */
    List<Friend> isFriend(@Param(value = "userPhone1") String userPhone1, @Param(value = "userPhone2") String userPhone2);

    /**
     * 查询XX的全部好友；（分页）
     * @param userPhone
     * @return
     */
    List<Friend> getAllFriend(@Param(value = "userPhone") String userPhone);
    Integer getCountAllFriend(@Param(value = "userPhone") String userPhone);

}