package com.zxx.employee.service;

/**
 * @author zxx
 * @date 2018/10/11 22:21
 */

import com.zxx.employee.domain.Employee;
import com.zxx.employee.domain.PageBean;

/**
 *
 * 员工管理业务层的接口
 */
public interface EmployeeService {
    Employee login(Employee employee);

    PageBean<Employee> findByPage(Integer currPage);
}
