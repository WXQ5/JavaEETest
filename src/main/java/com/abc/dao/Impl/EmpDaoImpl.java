package com.abc.dao.Impl;

import com.abc.common.ConnectionFactory;
import com.abc.dao.Idao.IEmpDao;
import com.abc.dao.entity.Emp;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpDaoImpl implements IEmpDao {
    @Override
    public List<Emp> findAll() {
        List<Emp> emps =new ArrayList<>();
        String sql = "select empno,ename,job,hiredate,sal from emp";
        Connection con = ConnectionFactory.getConnection();
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet set = pst.executeQuery();
            Emp emp = new Emp();
            while (set.next()){

                emp.setEmpno(set.getInt(1));
                emp.setEname(set.getString(2));
                emp.setJob(set.getString(3));
                emp.setHiredate(set.getDate(4));
                emp.setSal(set.getBigDecimal(5));
                emps.add(emp);
              //  System.out.println("$$$$"+emp);
            }
            pst.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emps;
    }
}
