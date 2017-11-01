package com.f103.it.friendApplyRecord;

import com.f103.it.page.PageParam;
import com.f103.it.page.PageResult;
import com.f103.it.pojo.FriendApplyRecord;

/**
 * @Project : p2p
 * @Package Name : com.f103.it.friendApplyRecord
 * @Description : TODO
 * @Author : 哀建宇
 * @Create Date : 2017年10月24日 11:06
 * @ModificationHistory Who When   What
 *
 * 功能模块：好友管理
 * 模块名称：申请好友管理
 *
 * 业务逻辑：
 * 1.添加好友申请记录；
 * 2.处理好友申请记录；
 * 3.查询某个用户的申请记录；（分页）
 * 4.查询请求添加该用户为好友的所有记录；（分页）
 */

public interface IFriendApplyRecordService {
    /**
     * 添加好友申请记录；
     * @param friendApplyRecord
     * @return void
     */
    public void addFriendApplyRecord(FriendApplyRecord friendApplyRecord);

    /**
     * 处理好友申请记录
     * @param id,isReceive
     * @return void
     */
    public void handleFriendApplyRecord(Integer id,Boolean isReceive);

    /**
     * 查询某个用户的申请记录；（分页）
     * @param farApplicant
     * @param param
     * @return PageResult<FriendApplyRecord>
     */
    public PageResult<FriendApplyRecord> searchAllFriendApplyRecordByUser(String farApplicant,PageParam param);

    /**
     *查询请求添加该用户为好友的所有记录；（分页）
     * @param farReceiver
     * @param param
     * @return PageResult<FriendApplyRecord>
     */
    public PageResult<FriendApplyRecord> searchAllApplyUserFriendRecord(String farReceiver,PageParam param);
}
