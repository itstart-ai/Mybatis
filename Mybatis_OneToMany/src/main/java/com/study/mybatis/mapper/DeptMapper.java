package com.study.mybatis.mapper;

import com.study.mybatis.beans.Dept;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 20:04 2020/5/3
 * @Modified By:
 */
public interface DeptMapper {
    public Dept deptFindById(int deptno);
}
