package com.study.mybatis.mapper;

        import com.study.mybatis.beans.Emp;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 20:04 2020/5/3
 * @Modified By:
 */
public interface EmpMapper {
    public Emp findEmpByEmpNo(Integer empNo);
}
