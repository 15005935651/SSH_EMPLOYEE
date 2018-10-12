package com.zxx.employee.dao.impl;

import com.zxx.employee.dao.EmployeeDao;
import com.zxx.employee.domain.Employee;
import org.junit.Test;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author zxx
 * @date 2018/10/12 13:37
 */

/**
 * 员工Dao层实现类
 */
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {
    /**
     * Dao层处理登录
     * @param employee
     * @return
     */
    @Override
    public Employee findByUsernameAndPassword(Employee employee) {
        String hql = "from Employee where username = ? and password = ?";
        List<Employee> list = (List<Employee>) this.getHibernateTemplate().find(hql,employee.getUsername(),employee.getPassword());
        if(list.size()>0){
            return list.get(0);
        }
        return null;
    }

}
