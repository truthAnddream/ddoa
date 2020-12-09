package com.qf.dao;

import Allpojo.Matter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MatterDao {
    //查询所有
    List<Matter> getAll();
    //删除
    int deleteMatter(int mid);

}
