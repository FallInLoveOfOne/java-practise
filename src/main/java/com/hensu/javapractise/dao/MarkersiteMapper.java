package com.hensu.javapractise.dao;

import com.hensu.javapractise.model.Markersite;
import com.hensu.javapractise.model.MarkersiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarkersiteMapper {
    long countByExample(MarkersiteExample example);

    int deleteByExample(MarkersiteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Markersite record);

    int insertSelective(Markersite record);

    List<Markersite> selectByExampleWithBLOBs(MarkersiteExample example);

    List<Markersite> selectByExample(MarkersiteExample example);

    Markersite selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Markersite record, @Param("example") MarkersiteExample example);

    int updateByExampleWithBLOBs(@Param("record") Markersite record, @Param("example") MarkersiteExample example);

    int updateByExample(@Param("record") Markersite record, @Param("example") MarkersiteExample example);

    int updateByPrimaryKeySelective(Markersite record);

    int updateByPrimaryKeyWithBLOBs(Markersite record);

    int updateByPrimaryKey(Markersite record);
}