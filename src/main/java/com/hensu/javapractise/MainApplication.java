package com.hensu.javapractise;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.Resource;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class, MybatisAutoConfiguration.class})// 取消启动默认连接数据库
@EnableTransactionManagement
@MapperScan({"com.hensu.javapractise.dao"})
public class MainApplication {

    @Value("${redis.host}")
    String redisHost;

    @Value("${redis.port}")
    int redisPort;

    @Value("${redis.timeout}")
    int timeOut;

    @Value("${redis.password}")
    String redisPass;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean(name = "shMainJedisPool")
    public JedisPool createJedisPool(){
        // GenericObjectPoolConfig poolConfig, String host, int port, int timeout, String password
        JedisPool pool = new JedisPool(new JedisPoolConfig(), redisHost,redisPort,timeOut*1000,redisPass,0);//创建Redis连接池
        return pool;
    }

    @Bean(name = "shMainJedis")
    @Scope("prototype")
    public Jedis createJedis(@Autowired JedisPool shMainJedisPool){
        Jedis jedis = shMainJedisPool.getResource();
        return jedis;
    }
}
