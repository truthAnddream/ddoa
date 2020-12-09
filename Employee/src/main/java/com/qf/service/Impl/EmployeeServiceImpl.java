package com.qf.service.Impl;
import Allpojo.Employee;
import com.qf.employeedao.IEmployeeDao;
import com.qf.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeDao employeeDao;

    @Override
    public List<Employee> getAllEmp() {
        return employeeDao.getAllEmp();
    }

    @Override
    public Employee login(String euser, String epass) {
        return employeeDao.login(euser, epass);
    }

    @Override
    public Employee getEmpByEid(int eid) {
        return employeeDao.getEmpByEid(eid);
    }

    @Override
    public boolean deleteEmpByEid(int eid) {
        return employeeDao.deleteEmpByEid(eid)>0;
    }

    @Override
    public boolean saveEmp(Employee employee) {
        return employeeDao.saveEmp(employee)>0;
    }

    @Override
    public boolean updateEmp(Employee employee) {
        return employeeDao.updateEmp(employee)>0;
    }

    @Override
    public int empCount() {
        return employeeDao.empCount();
    }
}
