package com.qf.employeedao;

import Allpojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
    public interface IEmployeeDao {
        List<Employee> getAllEmp();

        Employee login(@Param("euser") String euser, @Param("epass") String epass);

        Employee getEmpByEid(@Param("eid") int eid);

        int deleteEmpByEid(@Param("eid") int eid);

        int saveEmp(Employee employee);

        int updateEmp(Employee employee);

        int empCount();
    }

