package com.study.mybatis.test;

import com.study.mybatis.beans.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

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
    public void testQuery() {
        Dept dept = session.selectOne("deptFindById", 44);
        System.out.println(dept.getdName() + "====" + dept.getDeptNo() + "====" + dept.getLoc()+ "====" + dept.getFlag());
    }

    @Test
    public void testQueryAll() {
        List<Dept> list = session.selectList("queryAllInfo");
        for(Dept dept:list){
            System.out.println(dept.getdName() + "====" + dept.getDeptNo() + "====" + dept.getLoc()+ "====" + dept.getFlag());
        }
    }


    @After
    public void deploy() {
        if (session != null) {
            session.close();
        }
    }
}
