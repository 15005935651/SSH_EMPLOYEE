package com.zxx.employee.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zxx.employee.domain.Employee;
import com.zxx.employee.service.EmployeeService;

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

    /**
     * 登录执行的方法
     * @return
     */
    public String login(){
        System.out.println("login()执行了");
        Employee existEmployee = employeeService.login(employee);
        if(existEmployee == null){
            this.addActionError("用户名或密码错误！");
            return INPUT;
        }else {
            ActionContext.getContext().getSession().put("existEmployee",existEmployee);
            return SUCCESS;
        }
    }


    //注入业务层
    private EmployeeService employeeService;
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }



}
