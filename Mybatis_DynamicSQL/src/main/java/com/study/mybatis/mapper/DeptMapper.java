package com.study.mybatis.mapper;

import com.study.mybatis.beans.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 15:36 2020/4/29
 * @Modified By:
 */
public interface DeptMapper {
    public List<Dept> dept_1(Dept dept);

    public List<Dept> dept_2(Dept dept);

    public List<Dept> dept_3(Dept dept);

    public int deptUpdate(Dept dept);

    public List<Dept> deptFindByList(List deptNoList);

    public List<Dept> deptFindByArray(int[] deptArray);

    public List<Dept> deptFindByMap(@Param("myMap") Map amp);
}
