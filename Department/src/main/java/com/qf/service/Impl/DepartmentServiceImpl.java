package com.qf.service.Impl;

import Allpojo.Department;
import com.qf.dao.DepartmentDao;

import com.qf.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;
    //查询所有的部门
    @Override
    public List<Department> getAll() {
        return departmentDao.getAll();
    }

    @Override
    public boolean saveDep(Department department) {
        return departmentDao.saveDep(department)>0;
    }

    @Override
    public boolean deleteDep(int did) {
        return departmentDao.deleteDep(did)>0;
    }

    @Override
    public boolean updateDep(Department department) {
        return departmentDao.updateDep(department)>0;
    }

    @Override
    public Department findDep(int did) {
        return departmentDao.findDep(did);
    }
}
