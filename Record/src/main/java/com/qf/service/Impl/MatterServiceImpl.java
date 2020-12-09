package com.qf.service.Impl;

import Allpojo.Matter;
import com.qf.dao.MatterDao;
import com.qf.service.MatterSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatterServiceImpl implements MatterSrvice {
    @Autowired
    private MatterDao matterDao;
    @Override
    public List<Matter> getAll() {
        return matterDao.getAll();
    }

    @Override
    public boolean deleteMatter(int mid) {
        return matterDao.deleteMatter(mid)>0;
    }


}
