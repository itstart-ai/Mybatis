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

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 16:38 2020/4/29
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
        DeptMapper deptMapper = session.getMapper(DeptMapper.class);
        Dept dept = new Dept();
        dept.setDeptNo(49);
        dept.setLoc("北京");
        List<Dept> list = deptMapper.dept_1(dept);
        for (Dept info : list) {
            System.out.println(info.getdName());
        }
    }

    @Test
    public void test02() {
        DeptMapper dao = session.getMapper(DeptMapper.class);
        Dept dept = new Dept();
        dept.setdName("ES");
        List list = dao.dept_2(dept);
        System.out.println(list.size());
    }

    @Test
    public void test03() {
        DeptMapper dao = session.getMapper(DeptMapper.class);
        Dept dept = new Dept();
        dept.setDeptNo(49);
        dept.setdName("金融事业部2");
        dao.deptUpdate(dept);
        session.commit();
    }

    @Test
    public void test04() {
        DeptMapper dao = session.getMapper(DeptMapper.class);
        Dept dept = new Dept();
        dept.setdName("金融事业部2");
        dept.setLoc("北京");
        List list = dao.dept_3(dept);
        System.out.println(list.size());
    }


    @Test
    public void test05() {
        try {
            DeptMapper dao = session.getMapper(DeptMapper.class);
            List list = new ArrayList();
            list.add(41);
            list.add(42);
            List<Dept> deptList = dao.deptFindByList(list);
            System.out.println("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void test06() {
        try {
            DeptMapper dao = session.getMapper(DeptMapper.class);
            int dpetArray[] = new int[2];
            dpetArray[0] = 41;
            dpetArray[1] = 42;
            List<Dept> deptList = dao.deptFindByArray(dpetArray);
            System.out.println("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    @Test
    public void test07() {
        try {
            DeptMapper dao = session.getMapper(DeptMapper.class);
            Map map = new HashMap();
            map.put("key1", 41);
            map.put("key2", 42);
            List<Dept> deptList = dao.deptFindByMap(map);
            System.out.println("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @After
    public void deploy() {
        if (session != null) {
            session.close();
        }
    }
}
