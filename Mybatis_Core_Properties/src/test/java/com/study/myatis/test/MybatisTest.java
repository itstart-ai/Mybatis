package com.study.myatis.test;

import com.study.mybatis.beans.Dept;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 15:29 2020/4/27
 * @Modified By:
 */
public class MybatisTest {
    private SqlSession session;

    @Before
    public void start() {
        try {
            InputStream is = Resources.getResourceAsStream("myBatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            session = factory.openSession();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void test() {
        Dept dept = new Dept();
        dept.setDname("风控部");
        dept.setLoc("北京");
        try {
            session.insert("saveInfo", dept);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testQuery() {
        Dept dept = session.selectOne("deptFindById", 44);
        System.out.println(dept.getDname() + "====" + dept.getDeptNo() + "====" + dept.getLoc());
    }

    @Test
    public void testQueryAllInfo() {
        List<Dept> list = session.selectList("queryAllInfo");
        for (Dept dept : list) {
            System.out.println(dept.getDname() + "====" + dept.getDeptNo() + "====" + dept.getLoc());
        }
    }

    @After
    public void deploy() {
        if (session != null) {
            session.close();
        }
    }
}
