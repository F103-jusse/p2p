package com.f103.it.controller;

import com.f103.it.constant.SystemConstant;
import com.f103.it.result.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {

    @ExceptionHandler(value = {RuntimeException.class})
    public Object exception(Exception e){
        Result result = new Result(false);
        result.setContent(e.getMessage());
        System.out.println("controller异常");
        e.printStackTrace();

        return result;
    }
    protected Object getResult(Object... msg){
        Result result = new Result(true);
        return result.setContent(msg);
    }
}
