package com.hensu.javapractise.service.impl;

import com.hensu.javapractise.dao.MarkersiteMapper;
import com.hensu.javapractise.service.SiteService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;

/**
 * @Author: sh
 * @Description: SiteServiceImpl
 * @Date: 14:17 2019/8/26
 */
@Service
public class SiteServiceImpl implements SiteService {

    @Resource
    MarkersiteMapper dao;

    /**
     * 若手动捕捉异常，则事务回滚也要手动回滚
     * @param id
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public int deleteById(Long id) {
        try {
            dao.deleteByPrimaryKey(id);
            int n = 2/0;
            return 1;
        }catch (Exception e){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();// 异常被捕捉到无比手动回滚事务
            return 0;
        }
    }
}
