package com.abc.service.Impl;

import com.abc.dao.Impl.EmpDaoImpl;
import com.abc.dao.entity.Emp;
import com.abc.service.iservice.IEmpService;

import java.util.ArrayList;
import java.util.List;

public class EmpServiceImpl implements IEmpService {
    @Override
    public List<Emp> findAll() {
       List<Emp> emps = new ArrayList<>();
       EmpDaoImpl empDao = new EmpDaoImpl();
       emps = empDao.findAll();
       return  emps;
    }
}
