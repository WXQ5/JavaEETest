package com.abc.service.iservice;

import com.abc.common.Res;

public interface IUserService {
    Res login(String username, String password) throws Exception;
}
