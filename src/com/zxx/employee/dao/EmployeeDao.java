package com.zxx.employee.dao;

/**
 * @author zxx
 * @date 2018/10/11 22:24
 */

import com.zxx.employee.domain.Employee;

import java.util.List;

/**
 * 员工管理Dao层接口
 */
public interface EmployeeDao {
    Employee findByUsernameAndPassword(Employee employee);

    int findCount();

    List<Employee> findByPage(int begin, int pageSize);

    void save(Employee employee);
}
