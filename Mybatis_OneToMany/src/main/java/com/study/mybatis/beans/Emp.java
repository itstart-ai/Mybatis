package com.study.mybatis.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 20:04 2020/5/3
 * @Modified By:
 */
public class Emp {
    private Integer empNo;
    private String eName;
    private String job;
    private Integer parentNo;
    private Double sal;
    private Double comm;
    private Integer deptNo;

    public Integer getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getParentNo() {
        return parentNo;
    }

    public void setParentNo(Integer parentNo) {
        this.parentNo = parentNo;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empNo=" + empNo +
                ", eName='" + eName + '\'' +
                ", job='" + job + '\'' +
                ", parentNo=" + parentNo +
                ", sal=" + sal +
                ", comm=" + comm +
                ", deptNo=" + deptNo +
                '}';
    }
}
