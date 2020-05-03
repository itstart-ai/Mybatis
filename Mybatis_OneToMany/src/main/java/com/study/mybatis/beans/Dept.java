package com.study.mybatis.beans;

import java.util.List;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 20:04 2020/5/3
 * @Modified By:
 */
public class Dept {
    private Integer deptNo;
    private String dName;
    private String loc;
    private boolean flag;
    //隶属于当前部门下的所有的职员集合
    private List<Emp> empList;

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", dName='" + dName + '\'' +
                ", loc='" + loc + '\'' +
                ", flag=" + flag +
                ", empList=" + empList +
                '}';
    }
}
