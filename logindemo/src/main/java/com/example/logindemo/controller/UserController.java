package com.example.logindemo.controller;

import com.example.logindemo.entity.Result;
import com.example.logindemo.entity.User;
import com.example.logindemo.service.UserService;
import com.example.logindemo.utils.WebSecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:guoxin
 * @date:2019/4/2 22:40
 * @description:
 */
@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 没有添加数据库判断的登录方法
     * @param user
     * @return
     */
    @PostMapping("/login")
    public Map<String,Object> login(@RequestBody Map user){
        Map<String,Object> map = new HashMap<>(6) ;
        if("guo".equals(user.get("username"))&&"123".equals(user.get("password"))){
            map.put("flag",true) ;
            map.put("msg","登录成功") ;
            return map ;
        }
        map.put("flag","false") ;
        map.put("msg","用户名或密码错误") ;
        return map ;
    }
    /**
     * @creator: guoxin
     * @date: 2019/3/21 16:22
     * @param: [user, session]
     * @return: com.server.vueblog.entity.Result
     * @description:添加了数据库判断的登录方法
     */
    @PostMapping("/loginVerify")
    public Result login(@RequestBody User user, HttpSession session){
        System.out.println(user.getLoginname());
        boolean isLogin=userService.verifyLogin(user);
        System.out.println(isLogin);
        if (isLogin){
            session.setAttribute(WebSecurityConfig.SESSION_KEY,user.getLoginname());
            return new Result(200,"登陆成功",null);
        }else {
            return new Result(500,"登录失败",null);
        }
    }
}
