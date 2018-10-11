package com.jk.service;

import com.jk.model.ResultPage;
import com.jk.model.UserBean;

import java.util.List;

public interface UserService {


    ResultPage queryUser(UserBean user);

    void addUserLdw(UserBean userBean);

    UserBean queryUserByIdLdw(Integer userId);

    void editUserLdw(UserBean userBean);

    void deleteUserLdw(Integer userId);
}
