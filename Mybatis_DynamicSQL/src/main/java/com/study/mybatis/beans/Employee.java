package com.study.mybatis.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 15:11 2020/4/29
 * @Modified By:
 */
public class Employee {
    private Integer empNo;
    private String  eName;
    private String  job;
    private Double  sal;
    private Date hireDate;
    //职员工作年限
    private int workAge;

    public Employee(Date tempDate) {
        this.hireDate = tempDate;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        this.workAge = Integer.valueOf(sdf.format(new Date())) -  Integer.valueOf(sdf.format(tempDate));
    }

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

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }
}
