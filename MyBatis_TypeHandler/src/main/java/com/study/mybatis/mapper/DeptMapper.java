package com.study.mybatis.mapper;

import com.study.mybatis.beans.Dept;

import java.util.List;

public interface DeptMapper {
    public Dept deptFindById(Integer deptNo);

    public void saveInfo(Dept dept);

    public List<Dept> queryAllInfo();
}
