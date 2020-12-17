package com.superarilo.arilo.controller;

import com.superarilo.arilo.entity.User_Data;
import com.superarilo.arilo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/User_Data")
public class User_Data_Handler
{
    @Autowired
    private UserRepository userRepository;
    private String User_email;
    private HttpSession session;
    @PostMapping("/save")
    public Object Save(@RequestBody User_Data user_data, HttpServletRequest request)
    {
        User_email = user_data.getUseremail();
        session = request.getSession();
        session.setAttribute(User_email,user_data);
        User_Data result =  userRepository.save(user_data);
        if (result != null)
        {
            return session.getAttribute(User_email);
        }
        else
        {
            return "error";
        }
    }
    @PostMapping("/login")
    public Object Login(@RequestBody User_Data user_data, HttpServletRequest request)
    {
        User_email = user_data.getUseremail();
        User_Data result = userRepository.findByUseremailAndUserpwd(user_data.getUseremail(),user_data.getUserpwd());
        session = request.getSession();
        session.setAttribute(User_email,result);
        if (result != null)
        {
            return session.getAttribute(User_email);
        }
        else
        {
            return "error";
        }
    }
    @RequestMapping("/out")
    public String login_out()
    {
        session.removeAttribute(User_email);
        session.invalidate();
        User_email = null;
        return null;
    }
    @GetMapping("/Check_User")
    public Object Check()
    {
        if (User_email == null)
        {
            return "你还未登录";
        }
        else
        {
            return session.getAttribute(User_email);
        }
    }
}
