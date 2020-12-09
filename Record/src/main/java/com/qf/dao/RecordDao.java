package com.qf.dao;


import Allpojo.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecordDao {
    //查询所有
    List<Record> getAllRecord();
}
