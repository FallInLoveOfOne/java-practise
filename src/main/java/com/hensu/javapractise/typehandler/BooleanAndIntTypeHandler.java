package com.hensu.javapractise.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: sh
 * @Description: BooleanAndIntTypeHandler
 * @Date: 10:05 2019/8/29
 */
public class BooleanAndIntTypeHandler extends BaseTypeHandler<Boolean> {


    // 参数：PreparedStatement对象，int为PreparedStatement对象操作参数的位置，Boolean：java值（父类泛型对应）
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Boolean aBoolean, JdbcType jdbcType) throws SQLException {
        if(aBoolean){// true转为1
            preparedStatement.setInt(i,1);
        }else {// false转为0
            preparedStatement.setInt(i,0);
        }
    }

    // 参数ResultSet为携带返回数据的容器，String：为表的列名
    @Override
    public Boolean getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return (resultSet.getInt(s)==1?true:false);// 结果1/0转换为true/false
    }

    //int：表示为第多少列
    @Override
    public Boolean getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return (resultSet.getInt(i)==1?true:false);// 结果1/0转换为true/false
    }

    // CallableStatement：存储函数，这里表示：从存储过程中根据第几列拿数据
    @Override
    public Boolean getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return callableStatement.getInt(i)==1?true:false;
    }
}
