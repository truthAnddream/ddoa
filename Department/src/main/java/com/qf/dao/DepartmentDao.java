package com.qf.dao;


import Allpojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentDao {
    //查询所有的部门
    List<Department> getAll();
    //添加部门
    int saveDep(Department department);
    //删除部门
    int deleteDep(int did);
    //修改部门
    int updateDep(Department department);
    //根据id查询部门
    Department findDep(int did);
}
