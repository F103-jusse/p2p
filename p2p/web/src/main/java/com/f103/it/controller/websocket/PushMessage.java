package com.f103.it.controller.websocket;

import com.f103.it.constant.SystemConstant;
import com.f103.it.friendApplyRecord.IFriendApplyRecordService;
import com.f103.it.friendApplyRecord.IFriendService;
import com.f103.it.pojo.FriendApplyRecord;
import com.f103.it.pojo.User;
import com.f103.it.service.friendApplyRecord.FriendApplyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.http.HttpSession;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Project : p2p
 * @Package Name : com.f103.it.controller.websocket
 * @Description : TODO
 * @Author : 哀建宇
 * @Create Date : 2017年11月01日 10:30
 * @ModificationHistory Who When   What
 */
@ComponentScan
@ServerEndpoint("/websocket")
public class PushMessage {
    @Autowired
    private HttpSession httpSession;
    @Autowired
    private IFriendApplyRecordService farService;

    private static Map<String,Session> sessionMap = new ConcurrentHashMap<String, Session>(100);
    @OnOpen
    public void onOpen(Session session){
        User currentUser = (User) httpSession.getAttribute(SystemConstant.default_user);
        sessionMap.put(currentUser.getUserPhone(),session);
        System.out.println("用户"+currentUser.getUserPhone()+"建立websocket连接！");
    }
    @OnClose
    public void onClose(){
        User currentUser = (User) httpSession.getAttribute(SystemConstant.default_user);
        sessionMap.remove(currentUser.getUserPhone());
        System.out.println("用户"+currentUser.getUserPhone()+"关闭websocket连接");
    }
    @OnMessage
    public void onMessage(String message,Session session){
     //   System.out.println("来自用户"+  +"的消息："+message);
     //   farService.handleFriendApplyRecord();
    }
}
