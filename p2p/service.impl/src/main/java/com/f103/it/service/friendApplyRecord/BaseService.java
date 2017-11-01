package com.f103.it.service.friendApplyRecord;

import com.f103.it.dao.FriendApplyRecordMapper;
import com.f103.it.dao.FriendMapper;
import com.f103.it.pojo.Friend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

@Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,
        readOnly = false,rollbackFor = {Exception.class},timeout = 30)
public class BaseService {
    @Autowired
    protected FriendApplyRecordMapper frmMapper;
    @Autowired
    protected FriendMapper fMapper;
    @Autowired
    protected HttpSession session;
}
