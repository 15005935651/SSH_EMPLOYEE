package com.zxx.employee.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zxx.employee.domain.Employee;

/**
 * @author zxx
 * @date 2018/10/11 22:17
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {

    private Employee employee = new Employee();
    @Override
    public Employee getModel() {
        return employee;
    }

    //登录执行的方法
    public String login(){
        return NONE;
    }



}
