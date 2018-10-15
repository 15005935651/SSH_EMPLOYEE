package com.zxx.employee.dao.impl;
import com.zxx.employee.dao.DepartmentDao;
import com.zxx.employee.domain.Department;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author zxx
 * @date 2018/10/12 15:00
 */
public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {
    /**
     * 删除部门的方法
     * @param department
     */
    @Override
    public void delete(Department department) {
        this.getHibernateTemplate().delete(department);
    }

    @Override
    public int findCount() {
        String hql = "select count(*) from Department";
        List<Long> list =(List<Long>) this.getHibernateTemplate().find(hql);
        if (list.size()>0){
            return list.get(0).intValue();
        }
        return 0;
    }

    @Override
    public List<Department> findByPage(int begin, int pageSize) {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Department.class);
        List<Department> list = (List<Department>) this.getHibernateTemplate().findByCriteria(detachedCriteria,begin,pageSize);
        return list;
    }

    /**
     * Dao层保存部门的实现方法
     * @param department
     */
    @Override
    public void save(Department department) {
        this.getHibernateTemplate().save(department);
    }

    /**
     * 查询部门根据ID
     * 编辑部门
     * @param did
     * @return
     */
    @Override
    public Department findById(Integer did) {
        return this.getHibernateTemplate().get(Department.class,did);
    }

    /**
     * 实现部门修改
     * @param department
     */
    @Override
    public void update(Department department) {
        this.getHibernateTemplate().update(department);
    }

    /**
     * 查找所有部门
     * @return
     */
    @Override
    public List<Department> findALl() {
        return (List<Department>)this.getHibernateTemplate().find("from Department ");
    }
}
