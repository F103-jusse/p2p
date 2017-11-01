package com.f103.it.controller.friendApplyRecord;

import com.f103.it.controller.BaseController;
import com.f103.it.friendApplyRecord.IFriendApplyRecordService;
import com.f103.it.page.PageParam;
import com.f103.it.pojo.FriendApplyRecord;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping(value="/FriendApply")
public class FriendApplyRecordController extends BaseController {
    @Resource
    private IFriendApplyRecordService service;

    @RequestMapping(value="/add",method = RequestMethod.POST)
    public Object addFriendApplyRecord(@RequestBody FriendApplyRecord record){
        service.addFriendApplyRecord(record);
        return getResult("apply success");
    }

    @RequestMapping(value="/handle/{id}/{isReceive}",method = RequestMethod.PUT)
    public Object handleFriendApplyRecord(@PathVariable(value = "id")Integer id,@PathVariable(value="isReceive")Boolean isReceive){
        service.handleFriendApplyRecord(id,isReceive);
        return getResult("handle success");
    }

    @RequestMapping(value="/collection/search/{farApplicant}",method = RequestMethod.GET)
    public Object searchAllFriendApplyRecordByUser(@PathVariable(value = "farApplicant")String farApplicant, PageParam pageParam){
        return getResult(service.searchAllFriendApplyRecordByUser(farApplicant,pageParam));
    }
    @RequestMapping(value="/collection/searchTo/{farReceiver}",method = RequestMethod.GET)
    public Object searchAllApplyUserFriendRecord(@PathVariable(value="farReceiver")String farReceiver,PageParam pageParam){
        return getResult(service.searchAllApplyUserFriendRecord(farReceiver,pageParam));
    }
    @RequestMapping(value="/")
    public Object startTest(){
        return "好友申请模块";
    }
}
