package com.jk.controller;

import com.jk.model.ResultPage;
import com.jk.model.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 类描述：
 * 创建人：LDW
 * 创建时间：2018/10/10 19:07
 * 修改人：LDW
 * 修改时间：2018/10/10 19:07
 * 修改备注：
 * @version ：1.0
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
   private UserService userService;


    @RequestMapping("queryUser")
    @ResponseBody
    public ResultPage queryOrderList(UserBean user) {
        ResultPage resultPage = userService.queryUser(user);
        return resultPage;
    }

    @RequestMapping("toAddUser")
    public String toAddUserLdw() {
        return "addUser";
    }
    @RequestMapping("addUser")
    @ResponseBody
    public String addUserLdw(UserBean userBean) {
        userService.addUserLdw(userBean);
        return "{}";
    }

    @RequestMapping("toEditUser")
    public String toEditUser(Model model, Integer userId) {
        UserBean editUser = userService.queryUserByIdLdw(userId);
        model.addAttribute("editUser", editUser);
        return "editUser";
    }
    @RequestMapping("editUser")
    @ResponseBody
    public String editUserLdw(UserBean userBean) {
        userService.editUserLdw(userBean);
        return "{}";
    }
    @RequestMapping("deleteUser")
    @ResponseBody
    public String deleteUserLdw(Integer userId) {
        userService.deleteUserLdw(userId);
        return "{}";
    }


}
