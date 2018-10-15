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

        ss(2);

    }

    @After
    public void destroy(){

    }

    private void ss(int x){

        switch(x){
            case 3:
                System.out.println(3);
                break;
            case 2:
                break;
            case 1:
                System.out.println(1);
                break;
            case 4:
                System.out.println(4);
        }
    }

}
