package com.f103.it.controller.friendApplyRecord;

import com.f103.it.controller.BaseController;
import com.f103.it.friendApplyRecord.IFriendService;
import com.f103.it.page.PageParam;
import com.f103.it.pojo.Friend;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project : p2p
 * @Package Name : com.f103.it.controller.friendApplyRecord
 * @Description : TODO
 * @Author : 哀建宇
 * @Create Date : 2017年10月26日 10:22
 * @ModificationHistory Who When   What
 */
@RestController
@RequestMapping(value = "/Friend")
public class FriendController extends BaseController{
    @Autowired
    private IFriendService service;
    @RequestMapping(value = "/isFriend/{userPhone}",method = RequestMethod.GET)
    public Object isFriend(@PathVariable(value = "userPhone")String userPhone){
        return getResult(service.isFriend(userPhone));
    }
    @RequestMapping(value="/getAllFriend",method = RequestMethod.GET)
    public Object getAllFriend(PageParam pageParam){
        return getResult(service.getAllFriend(pageParam));
    }
}
