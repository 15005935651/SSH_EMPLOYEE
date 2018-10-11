package com.zxx.employee.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author zxx
 * @date 2018/10/11 21:15
 */
public class JunitTest {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init(){
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();
        transaction = (Transaction)session.beginTransaction();

    }

    @Test
    public void test(){

        Employee employee = new Employee();
        employee.setEid(001);

        session.save(employee);

    }

    @After
    public void destroy(){
        transaction.commit();
        session.close();
        sessionFactory.close();

    }

}
