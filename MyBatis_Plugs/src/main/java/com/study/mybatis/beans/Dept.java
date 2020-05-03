package com.study.mybatis.beans;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 9:37 2020/4/29
 * @Modified By:
 */
public class Dept {
    private Integer deptNo;
    private String dName;
    private String loc;
    private Boolean flag;
    private String country;

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

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

