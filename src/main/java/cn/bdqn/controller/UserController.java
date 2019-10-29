package cn.bdqn.controller;

import cn.bdqn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/login.html")
    public String login(){
        return "login";
    }
    @RequestMapping(value = "/login.html",method = RequestMethod.POST)
    public String loginDo(User user, HttpSession session){
        User user_loing=userService.login(user.getUserCode(),user.getUserPassword());
        if(user_loing!=null){
            session.setAttribute("user",user_loing);
            return "main";
        }
        return "login";
    }

}
