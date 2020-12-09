package com.qf.service.Impl;

import Allpojo.Leave;
import com.qf.dao.LeaveDao;
import com.qf.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveServiceImpl implements LeaveService {
    @Autowired
    private LeaveDao leaveDao;
    @Override
    public boolean saveLeave(Leave leave) {
        return leaveDao.saveLeave(leave)>0;
    }
}
