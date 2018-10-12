package com.zxx.employee.service.impl;

import com.zxx.employee.dao.DepartmentDao;
import com.zxx.employee.service.DepartmentService;

/**
 * @author zxx
 * @date 2018/10/12 22:11
 */
public class DepartmentServiceImpl implements DepartmentService {
    /**
     * 注入部门管理的Dao
     */
    private DepartmentDao departmentDao;

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }
}
