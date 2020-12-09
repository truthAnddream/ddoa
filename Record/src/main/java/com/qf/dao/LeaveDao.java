package com.qf.dao;
import Allpojo.Leave;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LeaveDao {
    //添加
    int saveLeave(Leave leave);
}
