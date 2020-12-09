package com.qf.service;



import Allpojo.Department;

import java.util.List;

public interface DepartmentService {
    //查询所有的部门
    List<Department> getAll();
    //添加部门
    boolean saveDep(Department department);
    //删除部门
    boolean deleteDep(int did);
    //修改部门
    boolean updateDep(Department department);
    //根据id查询部门
    Department findDep(int did);
}
