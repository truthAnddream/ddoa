package com.qf.service;


import Allpojo.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmp();

    Employee login(String euser,String epass);

    Employee getEmpByEid(int eid);

    boolean deleteEmpByEid(int eid);

    boolean saveEmp(Employee employee);

    boolean updateEmp(Employee employee);

    int empCount();

}
