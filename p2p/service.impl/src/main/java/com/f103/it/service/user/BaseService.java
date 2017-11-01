package com.f103.it.service.user;

import com.f103.it.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

@Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED,
        readOnly = false,rollbackFor = {Exception.class},timeout = 30)
public class BaseService {
    @Autowired
    protected UserMapper mapper;
    @Autowired
    protected HttpSession session;
}
