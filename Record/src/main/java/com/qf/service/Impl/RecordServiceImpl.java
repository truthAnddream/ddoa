package com.qf.service.Impl;

import Allpojo.Record;
import com.qf.dao.RecordDao;
import com.qf.service.RecordSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements RecordSrvice {
    @Autowired
    private RecordDao recordDao;
    @Override
    public List<Record> getAllRecord() {
        return recordDao.getAllRecord();
    }
}
