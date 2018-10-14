package com.zxx.employee.dao;

import com.zxx.employee.domain.Department;

import java.util.List;

/**
 * @author zxx
 * @date 2018/10/12 22:13
 */
public interface DepartmentDao {

    void delete(Department department);


    int findCount() ;
    List<Department> findByPage(int begin, int pageSize);

    void save(Department department);

    Department findById(Integer did);

    void update(Department department);
}
