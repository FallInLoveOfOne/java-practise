package com.hensu.javapractise.service.impl;

import com.hensu.javapractise.service.HoloService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author: sh
 * @Description: HoloServiceImpl
 * @Date: 13:55 2019/8/26
 */
@Service
public class HoloServiceImpl implements HoloService {

    @Resource
    JdbcTemplate jdbcTemplate;

    @Transactional
    @Override
    public int deleteSiteById(Long id) {
        try {
            jdbcTemplate.execute("delete from lv_marker_site WHERE id="+id);
            int x=2/0;
            return 1;
        }catch (Exception e){
            return 0;
        }
    }
}
