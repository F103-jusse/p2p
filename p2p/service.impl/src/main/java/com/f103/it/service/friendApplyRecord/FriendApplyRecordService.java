package com.f103.it.service.friendApplyRecord;

import com.f103.it.constant.SystemConstant;
import com.f103.it.dao.FriendApplyRecordMapper;
import com.f103.it.friendApplyRecord.IFriendApplyRecordService;
import com.f103.it.friendApplyRecord.IFriendService;
import com.f103.it.page.PageParam;
import com.f103.it.page.PageResult;
import com.f103.it.pojo.Friend;
import com.f103.it.pojo.FriendApplyRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;
import java.sql.Timestamp;
import java.util.List;

@Service("IFriendApplyRecordService")
public class FriendApplyRecordService extends BaseService implements IFriendApplyRecordService {
    @Autowired
    private IFriendService fService;
    public void addFriendApplyRecord(FriendApplyRecord friendApplyRecord) {
        Timestamp applyTime = new Timestamp(System.currentTimeMillis());
        friendApplyRecord.setFarApplyTime(applyTime);
        frmMapper.insert(friendApplyRecord);
      //  frmMapper.insertSelective()
    }

    public void handleFriendApplyRecord(Integer id,Boolean isReceive) {
        frmMapper.handleFriendApplyRecord(id,isReceive? SystemConstant.friendApply_Receiver:SystemConstant.friendApply_Reject);
        FriendApplyRecord record = frmMapper.selectByPrimaryKey(id);

        //如果同意，则添加至好友关系表中
        if(isReceive){
            Friend friendRecord = new Friend();
            friendRecord.setfApplicant(record.getFarApplicant());
            friendRecord.setfReceiver(record.getFarReceiver());
            fService.addFriendRecord(friendRecord);
        }
    }

    @Transactional(readOnly = true)
    public PageResult<FriendApplyRecord> searchAllFriendApplyRecordByUser(String farApplicant, PageParam param) {
        List<FriendApplyRecord> listUser = frmMapper.searchAllFriendApplyRecordByUser(farApplicant);
        int total = frmMapper.getTotalAllFriendApplyRecordByUser(farApplicant);

        /*   分页处理  */
        PageResult<FriendApplyRecord> result = new PageResult<FriendApplyRecord>(param);
        result.setRows(listUser);
        result.setTotal(total);
        return result;
    }

    @Transactional(readOnly = true)
    public PageResult<FriendApplyRecord> searchAllApplyUserFriendRecord(String farReceiver, PageParam param) {
        List<FriendApplyRecord> listUser = frmMapper.searchAllApplyUserFriendRecord(farReceiver);
        int total = frmMapper.getTotalAllApplyUserFriendRecord(farReceiver);

        /*   分页处理  */
        PageResult<FriendApplyRecord> result = new PageResult<FriendApplyRecord>(param);
        result.setRows(listUser);
        result.setTotal(total);
        return result;
    }
}
