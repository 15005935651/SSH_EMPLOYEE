package com.zxx.employee.service.impl;

import com.zxx.employee.dao.EmployeeDao;
import com.zxx.employee.domain.Employee;
import com.zxx.employee.domain.PageBean;
import com.zxx.employee.service.EmployeeService;

import java.util.List;

/**
 * @author zxx
 * @date 2018/10/11 22:23
 */

/**
 * y员工管理业务层的实现类
 */
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDao employeeDao;

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    /**
     * 业务层登录方法
     * @param employee
     * @return
     */
    @Override
    public Employee login(Employee employee) {
        Employee exitEmployee = employeeDao.findByUsernameAndPassword(employee);
        return exitEmployee;
    }

    /**
     * 分页员工查询
     * @param currPage
     * @return
     */
    @Override
    public PageBean<Employee> findByPage(Integer currPage) {
        PageBean<Employee> pageBean = new PageBean<Employee>();
        //封装当前页数：
        pageBean.setCurrPage(currPage);
        //封装每页记录数
        int pageSize = 3;
        pageBean.setPageSize(pageSize);
        //封装总记录数
        int totalCount = employeeDao.findCount();
        pageBean.setTotalCount(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        //封装每页显示的数据
        int begin = (currPage-1)*pageSize;
        List<Employee> list = employeeDao.findByPage(begin,pageSize);
        pageBean.setList(list);
        return pageBean;
    }
}
