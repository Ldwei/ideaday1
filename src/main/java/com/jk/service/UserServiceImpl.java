package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.ResultPage;
import com.jk.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public ResultPage queryUser(UserBean user) {
        user.calculate();
        ResultPage resultPage = new ResultPage();
        int count =userMapper.queryUserTotal(user);
        resultPage.setTotal(count);
        List<UserBean> orders =userMapper.queryUserList(user);
        resultPage.setRows(orders);
        return resultPage;
    }

    @Override
    public void addUserLdw(UserBean userBean) {
        userMapper.addUserLdw(userBean);
    }

    @Override
    public UserBean queryUserByIdLdw(Integer userId) {
        return userMapper.queryUserByIdLdw(userId);
    }

    @Override
    public void editUserLdw(UserBean userBean) {
        userMapper.editUserLdw(userBean);
    }

    @Override
    public void deleteUserLdw(Integer userId) {
        userMapper.deleteUserLdw(userId);
    }
}
