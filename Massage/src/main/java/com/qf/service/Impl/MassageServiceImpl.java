package com.qf.service.Impl;
import Allpojo.Massage;
import com.qf.employeedao.MassageDao;
import com.qf.service.MassageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MassageServiceImpl implements MassageService {
    @Autowired
    MassageDao md;
    @Override
    public List<Massage> GetAllMassage(int deleteid) {
        return md.GetAllMassage(deleteid);
    }

    @Override
    public int MoveMassage(int deleteid,int eid) {
        return md.MoveMassage(deleteid,eid);
    }

    @Override
    public int delete(int eid) {
        return md.delete(eid);
    }

    @Override
    public int Update(Massage massage) {
        return md.Update(massage);
    }
}
