package com.zxx.employee.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zxx.employee.domain.Department;
import com.zxx.employee.domain.PageBean;
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
    public String findAll(){
        System.out.println("findall执行了");
        PageBean<Department> pageBean = departmentService.findByPage(currPage);
        //将pageBean存入到值栈中
        ActionContext.getContext().getValueStack().push(pageBean);
        return "findAll";
    }

    /**
     * 添加跳转
     */
    public String saveUI(){
        return "saveUI";
    }
    /**
     * 添加部门的执行方法
     */
    public String save(){

        departmentService.save(department);

        return "saveSuccess";

    }
    /**
     * 编辑部门的方法
     */
    public String edit(){
        department = departmentService.findByID(department.getDid());
        return "editSuccess";
    }
    /**
     * 修改部门的执行方法
     */
    public String update(){
        departmentService.update(department);
        return "updateSuccess";
    }
    /**
     * 删除部门执行的方法
     */
    public String delete(){
        department = departmentService.findByID(department.getDid());
        departmentService.delete(department);
        return "deleteSuccess";
    }


}
