package com.hensu.javapractise.redis.cfg;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: sh
 * @Description: RedisConfig
 * @Date: 16:48 2019/8/23
 */
@Data
@Component
@ConfigurationProperties(prefix = "redis")
public class RedisConfig {

    private String host;
    private int port;
    private int timeout;//秒
    private String password;
    private int poolMaxTotal;
    private int poolMaxIdle;
    private int poolMaxWait;//秒
    private int poolMaxActive;
}
