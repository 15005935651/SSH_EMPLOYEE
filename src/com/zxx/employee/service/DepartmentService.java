package com.zxx.employee.service;

import com.zxx.employee.domain.Department;
import com.zxx.employee.domain.PageBean;

/**
 * @author zxx
 * @date 2018/10/12 22:11
 */
public interface DepartmentService {
    PageBean<Department> findByPage(Integer currPage);

    void save(Department department);

    Department findByID(Integer did);

    void update(Department department);

    void delete(Department department);
}
