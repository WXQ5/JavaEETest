package com.abc.dao.Idao;

import com.abc.dao.entity.User;

public interface IUserDao {
    User userExsit(String username,String password) throws Exception;
}
