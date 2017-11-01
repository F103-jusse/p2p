package com.f103.it.service.friendApplyRecord;

import com.f103.it.constant.SystemConstant;
import com.f103.it.friendApplyRecord.IFriendService;
import com.f103.it.page.PageParam;
import com.f103.it.page.PageResult;
import com.f103.it.pojo.Friend;
import com.f103.it.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Project : p2p
 * @Package Name : com.f103.it.service.friendApplyRecord
 * @Description : TODO
 * @Author : 哀建宇
 * @Create Date : 2017年10月25日 10:46
 * @ModificationHistory Who When   What
 */
@Service("IFriendService")
public class FriendService extends BaseService implements IFriendService{

    public void addFriendRecord(Friend friendRecord) {
        fMapper.insert(friendRecord);
    }

    public Boolean isFriend(String userPhone) {
        User currentUser = (User) session.getAttribute(SystemConstant.default_user);
        List<Friend> resultList = fMapper.isFriend(currentUser.getUserPhone(),userPhone);
        Boolean isFriend = true;
        if(resultList.size()==0){
            isFriend = false;
        }
        return isFriend;
    }

    public PageResult<Friend> getAllFriend(PageParam param) {
        User currentUser = (User) session.getAttribute(SystemConstant.default_user);
        List<Friend> result = fMapper.getAllFriend(currentUser.getUserPhone());
        Integer total = fMapper.getCountAllFriend(currentUser.getUserPhone());

        /*  封装成分页对象  */
        PageResult<Friend> pageResult = new PageResult<Friend>(param);
        pageResult.setTotal(total);
        pageResult.setRows(result);
        return pageResult;
    }

}
