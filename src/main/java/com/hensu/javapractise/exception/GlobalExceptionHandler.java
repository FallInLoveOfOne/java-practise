package com.hensu.javapractise.exception;

import com.alibaba.fastjson.JSON;
import com.hensu.javapractise.vo.CodeMsg;
import com.hensu.javapractise.vo.ResultBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @describe 全局异常
 * @Author: sh
 * @Description: GlobalExceptionHandler
 * @Date: 15:37 2019/8/26
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(Exception ex){
        ResultBean resultBean = new ResultBean(CodeMsg.EX,ex.getMessage());
        return JSON.toJSONString(resultBean);
    }
}
