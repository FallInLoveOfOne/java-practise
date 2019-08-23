package com.hensu.javapractise.redis;

/**
 * @Author: sh
 * @Description: KeyPrefix
 * @Date: 17:02 2019/8/23
 */
public interface KeyPrefix {

    int expireSeconds();

    String getPrefix();
}
