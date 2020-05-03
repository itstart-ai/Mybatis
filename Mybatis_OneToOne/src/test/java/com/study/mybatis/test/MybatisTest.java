package com.study.mybatis.test;

import com.study.mybatis.beans.Emp;
import com.study.mybatis.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 20:31 2020/5/3
 * @Modified By:
 */
public class MybatisTest {
    private SqlSession session;

    @Before
    public void init() {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis_config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            session = factory.openSession();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Test
    public void test01() {
        EmpMapper empMapper = session.getMapper(EmpMapper.class);
        Emp emp = empMapper.findEmpByEmpNo(7499);
        System.out.println(emp);
        System.out.println("====");
        //System.out.println(emp.getDept().getdName()+"====="+emp.getDept().getLoc());
    }

    @After
    public void deploy() {
        if (session != null) {
            session.close();
        }
    }
}
