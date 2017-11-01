package com.f103.it.dao;

import com.f103.it.pojo.FriendApplyRecord;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FriendApplyRecordMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(FriendApplyRecord record);

    int insertSelective(FriendApplyRecord record);

    FriendApplyRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FriendApplyRecord record);

    int updateByPrimaryKey(FriendApplyRecord record);

    /**
     * 查询该用户所有的申请记录
     * @param farApplicant
     * @return List<FriendApplyRecord>
     */
    List<FriendApplyRecord> searchAllFriendApplyRecordByUser(@Param(value = "farApplicant") String farApplicant);
    Integer getTotalAllFriendApplyRecordByUser(@Param(value = "farApplicant") String farApplicant);

    /**
     * 查询所有添加该用户为好友的记录
     * @param farReceiver
     * @return List<FriendApplyRecord>
     */
    List<FriendApplyRecord> searchAllApplyUserFriendRecord(@Param(value="farReceiver") String farReceiver);
    Integer getTotalAllApplyUserFriendRecord(@Param(value = "farReceiver") String farReceiver);

    /**
     * 操作当前的申请记录状态
     * @param id farStatus
     * @return void
     */
    void handleFriendApplyRecord(@Param(value="id") Integer id,@Param(value="farStatus")Short farStatus);
}