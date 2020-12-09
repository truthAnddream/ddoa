package com.qf.dao;

import Allpojo.Cgrade;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ICgradedao {

    List<Cgrade> getAllCgrade();

    int saveCgrade(Cgrade c);

    Cgrade selectCrade(int cid);

    int deleteCrade(int  cid);

    int updateCrade(Cgrade c);

}
