package com.qf.employeedao;

import Allpojo.Massage;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface MassageDao {
    List<Massage> GetAllMassage(int deleteid);
    int MoveMassage(int deleteid,int eid);
    int delete(int eid);
    int Update(Massage massage);
}
