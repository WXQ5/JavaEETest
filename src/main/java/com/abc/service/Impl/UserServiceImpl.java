package com.abc.service.Impl;

import com.abc.common.Res;
import com.abc.common.ResEnum;
import com.abc.dao.Idao.IUserDao;
import com.abc.dao.Impl.UserDaoImpl;
import com.abc.dao.entity.User;
import com.abc.service.iservice.IUserService;

public class UserServiceImpl implements IUserService {
    @Override
    public Res login(String username, String password) {
        IUserDao userDao = new UserDaoImpl();
        User user = null;
        try {
            user = userDao.userExsit(username,password);
            System.out.println(user.getUsername());
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
        if (user != null && !"".equals(user)){
            user.setPassword("*****************");
            return Res.sucess(ResEnum.SUCCESS,user);
        }
        return Res.error(ResEnum.ERROR_USER_EXIST);
    }
}
