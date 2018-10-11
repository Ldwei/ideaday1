package com.jk.mapper;

import com.jk.model.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {


    int queryUserTotal(UserBean user);

    List<UserBean> queryUserList(@Param("user") UserBean user);

    void addUserLdw(UserBean userBean);

    UserBean queryUserByIdLdw(Integer userId);

    void editUserLdw(UserBean userBean);

    void deleteUserLdw(Integer userId);
}
