package com.zxx.employee.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zxx.employee.domain.Department;
import com.zxx.employee.service.DepartmentService;

/**
 * @author zxx
 * @date 2018/10/12 22:05
 */
public class DepartmentAction extends ActionSupport implements ModelDriven<Department> {
    /**
     * 模型驱动使用的对象
     */
    private Department department = new Department();
    @Override
    public Department getModel() {
        return department;
    }

    /**
     * 分页数
     */
    private Integer currPage = 1;
    public void setCurrPage(Integer currPage) {
        this.currPage = currPage;
    }

    /**
     * 提供部门管理的service
     */
    private DepartmentService departmentService;
    public void setDepartmentService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    /**
     * 提供一个查询的方法
     */
    private String findAll(){
        return NONE;
    }

}
