package com.hensu.javapractise.dao;

import com.hensu.javapractise.model.Marker;
import com.hensu.javapractise.model.MarkerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarkerMapper {
    long countByExample(MarkerExample example);

    int deleteByExample(MarkerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Marker record);

    int insertSelective(Marker record);

    List<Marker> selectByExample(MarkerExample example);

    Marker selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Marker record, @Param("example") MarkerExample example);

    int updateByExample(@Param("record") Marker record, @Param("example") MarkerExample example);

    int updateByPrimaryKeySelective(Marker record);

    int updateByPrimaryKey(Marker record);
}