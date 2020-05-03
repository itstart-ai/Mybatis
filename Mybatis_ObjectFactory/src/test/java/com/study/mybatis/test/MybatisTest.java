package com.study.mybatis.test;

import com.study.mybatis.beans.Dept;
import com.study.mybatis.mapper.DeptMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 10:00 2020/4/29
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testQueryAllInfo() {
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        List<Dept> list = deptMapper.queryAllInfo();
        for (Dept dept : list) {
            System.out.println("部门名称：" + dept.getdName() + "=== 部门编号：" + dept.getDeptNo() + "=== 地址位置：" + dept.getLoc());
        }
    }

    @Test
    public void testSaveInfo() {
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        Dept dept = new Dept();
        dept.setdName("金融事业部");
        dept.setLoc("北京");
        dept.setFlag(false);
        deptMapper.saveInfo(dept);
        session.commit();
    }

    @After
    public void deploy() {
        if (session != null) {
            session.close();
        }
    }
}
