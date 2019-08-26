package com.hensu.javapractise.vo;

import com.sun.org.apache.bcel.internal.classfile.Code;
import lombok.Data;

/**
 * @Author: sh
 * @Description: CodeMsg
 * @Date: 15:46 2019/8/26
 */
@Data
public class CodeMsg {
    private Integer code;
    private String msg;
    private CodeMsg(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
    public static CodeMsg SUCCES = new CodeMsg(0,"SUCCESS");
    public static CodeMsg FAIL = new CodeMsg(-1,"FAIL");
    public static CodeMsg EX = new CodeMsg(-1,"EX");
}
