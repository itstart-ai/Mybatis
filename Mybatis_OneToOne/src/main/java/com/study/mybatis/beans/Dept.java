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

    @Override
    public String toString() {
        return "Dept{" +
                "deptNo=" + deptNo +
                ", dName='" + dName + '\'' +
                ", loc='" + loc + '\'' +
                ", flag=" + flag +
                '}';
    }
}
