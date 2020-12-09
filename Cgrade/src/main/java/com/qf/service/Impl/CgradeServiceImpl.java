package com.qf.service.Impl;

import Allpojo.Cgrade;
import com.qf.dao.ICgradedao;

import com.qf.service.ICgradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CgradeServiceImpl implements ICgradeService {


    @Autowired
    private ICgradedao cgradedao;
    @Override
    public List<Cgrade> getAllCgrade() {
        return cgradedao.getAllCgrade();
    }

    @Override
    public boolean saveCgrade(Cgrade c) {
        return cgradedao.saveCgrade(c)>0;
    }

    @Override
    public Cgrade selectCrade(int cid) {
        return cgradedao.selectCrade(cid);
    }

    @Override
    public boolean deleteCrade(int cid) {
        return cgradedao.deleteCrade(cid)>0;
    }

    @Override
    public boolean updateCrade(Cgrade c) {
        return cgradedao.updateCrade(c)>0;
    }
}
