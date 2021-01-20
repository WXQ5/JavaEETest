package com.abc.dao.Idao;

import com.abc.dao.entity.Emp;

import java.util.List;

public interface IEmpDao {

    List<Emp> findAll()throws Exception;
}
