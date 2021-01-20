package com.abc.dao.Impl;

import com.abc.common.ConnectionFactory;
import com.abc.dao.Idao.IUserDao;
import com.abc.dao.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDaoImpl implements IUserDao {
    @Override
    public User userExsit(String username, String password) throws Exception {
        User user = new User();
        Connection con = ConnectionFactory.getConnection();
        String sql = "select username from user where username=? and password=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setObject(1,username);
        pst.setObject(2,password);
        ResultSet set = pst.executeQuery();
        while (set.next()){
            String name = set.getString("username");
            user.setUsername(name);
        }

        pst.close();
        con.close();
        return user;
    }


}
