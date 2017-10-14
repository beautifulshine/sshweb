package com.li.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.li.model.UserEntity;
import com.li.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
    private UserService userService;
    @ResponseBody
    @RequestMapping(value="/login", method = RequestMethod.GET)
    public Map<String,Object> login( UserEntity user){
        Map<String,Object> map = new HashMap<String,Object>();
        //System.out.println(user.toString());
        boolean loginResult = userService.isExist(user);
        map.put("loginResult", loginResult);
        return map;
    }
    
   
	@RequestMapping("/loginIn")
	public ModelAndView loginIn(HttpServletRequest request,HttpServletResponse response){
		ModelAndView modelAndView=new ModelAndView("/index.jsp");
		return modelAndView;
	}
    
}
