package com.zxx.employee.service.impl;

import com.zxx.employee.dao.DepartmentDao;
import com.zxx.employee.domain.Department;
import com.zxx.employee.domain.PageBean;
import com.zxx.employee.service.DepartmentService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zxx
 * @date 2018/10/12 22:11
 */
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    /**
     * 注入部门管理的Dao
     */
    private DepartmentDao departmentDao;

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    /**
     * 分页查询部门的方法
     * @param currPage
     * @return
     */
    @Override
    public PageBean<Department> findByPage(Integer currPage) {
        PageBean<Department> pageBean = new PageBean<Department>();
        //封装当前页数
        pageBean.setCurrPage(currPage);
        //每页显示记录数
        int pageSize = 3;
        pageBean.setPageSize(pageSize);
        //封装总的记录数
        int totalCount = departmentDao.findCount();
        pageBean.setTotalCount(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num = Math.ceil(tc/pageSize);
        pageBean.setTotalPage(num.intValue());
        //封装每页显示的数据
        int begin = (currPage-1)*pageSize;
        List<Department> list = departmentDao.findByPage(begin,pageSize);
        pageBean.setList(list);
        return pageBean;
    }

    /**
     * 添加部门的业务层实现
     * @param department
     */
    @Override
    public void save(Department department) {
        departmentDao.save(department);
    }

    /**
     *删除部门的执行方法
     * @param department
     */
    @Override
    public void delete(Department department) {
        departmentDao.delete(department);
    }

    /**
     * 业务层编辑部门实现
     * 根据部门ID查询部门
     * @param did
     * @return
     */
    @Override
    public Department findByID(Integer did) {

        return departmentDao.findById(did);
    }

    /**
     * 业务层实现修改部门
     * @param department
     */
    @Override
    public void update(Department department) {
        departmentDao.update(department);
    }
}
