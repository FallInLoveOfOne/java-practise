package com.hensu.javapractise.controller;

import com.alibaba.fastjson.JSON;
import com.hensu.javapractise.model.Seal;
import com.hensu.javapractise.rabbitmq.MQSender;
import com.hensu.javapractise.redis.RedisService;
import com.hensu.javapractise.service.HoloService;
import com.hensu.javapractise.service.SiteService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @Author: sh
 * @Description: HelloController
 * @Date: 14:33 2019/8/23
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Resource
    RedisService redisService;

    @Resource
    JdbcTemplate jdbcTemplate;

    @Resource
    HoloService holoService;

    @Resource
    SiteService siteService;

    @Resource
    MQSender mqSender;

    @Resource
    Jedis shMainJedis;

    @GetMapping(value = "/index", produces = {"application/json;charset=UTF-8"})
    public String hello() {
        Seal seal = new Seal();
        seal.setId(UUID.randomUUID().toString());
        seal.setNo("2009");
        seal.setName("公司专用章");
        String hello = null;
        boolean is = StringUtils.isEmpty(hello);
        seal.setNo("2010" + (is ? "-true" : "-false"));
        seal.setName("redis-" + redisService.get("haha"));
        return JSON.toJSONString(seal);
    }

    @GetMapping("/allSite")
    public String getAllSites() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM lv_marker_site");
        int n = holoService.deleteSiteById(6006L);
        Map<String, Object> tr = new HashMap<>();
        tr.put("tr", n);
        list.add(tr);
        int e = 1 / 0;
        return JSON.toJSONString(list);
    }

    /**
     * 事务测试
     *
     * @return
     */
    @GetMapping("/tr")
    public Integer testTr() {
        return siteService.deleteById(6006L);
    }

    /**
     * mq消息发送
     * @param msg
     */
    @GetMapping(value = "/sendmq/{msg}", produces = {"application/json;charset=UTF-8"})
    public void sendmq(@PathVariable String msg) {
        mqSender.send(msg);
    }

    @GetMapping("/getRedis")
    public String getRedis(){
        String val = shMainJedis.get("haha");
        return val;
    }
}
