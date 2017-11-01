package com.f103.it.friendApplyRecord;

/**
 * @Project : p2p
 * @Package Name : com.f103.it.friendApplyRecord
 * @Description : TODO
 * @Author : 哀建宇
 * @Create Date : 2017年10月24日 11:06
 * @ModificationHistory Who When   What
 */

import com.f103.it.page.PageParam;
import com.f103.it.page.PageResult;
import com.f103.it.pojo.Friend;

import java.util.List;

/**
 * 功能模块：好友管理
 * 模块名称：好友信息管理模块
 *
 * 业务逻辑：
 *  1.添加好友记录；
 *  2.查询XX是否已是当前用户的好友；
 *  3.查询当前用户的全部好友；（分页）
 */
public interface IFriendService {
    public void addFriendRecord(Friend friendRecord);

    public Boolean  isFriend(String userPhone);

    public PageResult<Friend> getAllFriend(PageParam param);
}
