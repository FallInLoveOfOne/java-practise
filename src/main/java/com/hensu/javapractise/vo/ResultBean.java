package com.hensu.javapractise.vo;

import lombok.Data;

/**
 * @Author: sh
 * @Description: ResultBean
 * @Date: 15:39 2019/8/26
 */

@Data
public class ResultBean {
    private Integer code;
    private String msg;
    private Object data;

    public ResultBean(Integer code,String msg,Object data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }
}
