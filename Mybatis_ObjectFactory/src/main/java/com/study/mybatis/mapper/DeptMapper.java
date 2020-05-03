package com.study.mybatis.mapper;

import com.study.mybatis.beans.Dept;

import java.util.List;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 9:39 2020/4/29
 * @Modified By:
 */
public interface DeptMapper {
    public List<Dept> queryAllInfo();

    public void saveInfo(Dept dept);
}
