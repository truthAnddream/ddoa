package com.qf.service;
import Allpojo.Matter;

import java.util.List;

public interface MatterSrvice {
    //查询所有
    List<Matter> getAll();
    //删除
    boolean deleteMatter(int mid);

}
