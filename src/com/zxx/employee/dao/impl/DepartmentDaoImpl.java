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
}
