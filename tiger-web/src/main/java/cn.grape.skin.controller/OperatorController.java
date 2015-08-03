package cn.grape.skin.controller;

import cn.grape.skin.domain.User;
import cn.grape.skin.page.UserPage;
import cn.grape.skin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Emily on 15/8/1.
 */
@Controller
@RequestMapping(value = "operator")
public class OperatorController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "index")
    public ModelAndView toIndex(String id){

        Map<String,Object> map = new HashMap<String, Object>();
        User user = userService.getUserById(Long.valueOf(id));
        map.put("user",user);
        return new  ModelAndView("register",map);

    }

    @RequestMapping(value = "to_user_list")
    public ModelAndView toUserList(){
        return new  ModelAndView("user_list");

    }

    @RequestMapping(value = "user_list")
    @ResponseBody
    public UserPage userList(String id){
        Map<String,Object> map = new HashMap<String, Object>();
        List<User> users = userService.findAll();
        UserPage userPage = new UserPage();
        userPage.setTotal(users.size());
        userPage.setRows(users);
        return userPage;
    }

}
