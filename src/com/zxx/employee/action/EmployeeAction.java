package com.zxx.employee.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zxx.employee.domain.Department;
import com.zxx.employee.domain.Employee;
import com.zxx.employee.domain.PageBean;
import com.zxx.employee.service.DepartmentService;
import com.zxx.employee.service.EmployeeService;

import java.util.List;

/**
 * @author zxx
 * @date 2018/10/11 22:17
 */
public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {

    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    private DepartmentService departmentService;

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


    /**
     * 当前页数
     */
    Integer currPage = 0;
    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    /**
     * 分页查询员工信息
     */
    public String findAll(){
        PageBean<Employee> pageBean = employeeService.findByPage(currPage);
        ActionContext.getContext().getValueStack().push(pageBean);
        return "findAll";
    }

    /**
     * 跳转到添加员工的界面
     */
    public String saveUI(){
        System.out.println("save执行了");
        List<Department> list = departmentService.findAll();
        ActionContext.getContext().getValueStack().set("list",list);
        return "saveUI";
    }


    /**
     * 添加员工信息
     */
    public String save(){
        employeeService.save(employee);
        return "saveSuccess";
    }




}
