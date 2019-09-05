package com.hensu.javapractise.util;

import lombok.Data;

import java.util.List;

/**
 * @Author: sh
 * @Description: SmsMsgSendVO 短信VO
 * @Date: 11:33 2019/8/30
 */
@Data
public class SmsMsgSendVO {
    private String siteNo;// 营业网点编码
    private String cropNo;// 用章单位编码
    private String phone;// 手机号
    private List<String> seals;// 印章编码
    private String msgContent;// 短信内容
    private String sealStatus;// 印章状态

}
