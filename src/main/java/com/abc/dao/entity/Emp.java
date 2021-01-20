package com.abc.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Emp {
    private int empno;
    private String ename;
    private String job;
    private Date hiredate;
    private BigDecimal sal;

    public Emp(int empno, String ename, String job, Date hiredate, BigDecimal sal) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.hiredate = hiredate;
        this.sal = sal;
    }

    public Emp(String ename, String job, Date hiredate, BigDecimal sal) {
        this.ename = ename;
        this.job = job;
        this.hiredate = hiredate;
        this.sal = sal;
    }

    public Emp() {
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }
}
