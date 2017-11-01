package com.f103.it.constant;

/**
 * @Project : p2p
 * @Package Name : com.f103.it.constant
 * @Description : 系统常量
 * @Author : 哀建宇
 * @Create Date : 2017年10月24日 15:55
 * @ModificationHistory Who When   What
 */
public class SystemConstant {
    public static final Short friendApply_Receiver = 1;
    public static final Short friendApply_Reject = 2;

    //session常量
    public static final String default_user = "user";
    //登陆返回常量
    public enum LoginResult{
        success("login success"),userNull("user null"),passwordError("password error");
        private String value;

        LoginResult(String value) {
            this.value = value;
        }
        public String getValue(){
            return value;
        }
    }

    public enum userStatus{
        register(0),onLine(1),offLine(2);
        private int value;
        private userStatus(int value){
            this.value = value;
        }
        public short getValue(){
            return (short) value;
        }
    }
}
