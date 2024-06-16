package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.User;

import com.example.demo.dao.UserDAO;

@Controller
public class UserController {
	@Autowired
    UserDAO userdao;
	@RequestMapping("index")
	public String user()
	{
		return "index.jsp";
	}
	
	@RequestMapping("addUser")
	public String addUser(User user)
	{
		userdao.save(user);
		return "index.jsp";
	}
	@RequestMapping("getUser")
	public ModelAndView getUser(@RequestParam int id)
	{
		ModelAndView mav = new ModelAndView("ShowUser.jsp");
		User user = userdao.findById(id).orElse(new User());
		mav.addObject(user);
		return mav;
	}
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(@RequestParam int id)
	{
		ModelAndView mav = new ModelAndView("DeleteUser.jsp");
		User user = userdao.findById(id).orElse(new User());
		userdao.deleteById(id);
		mav.addObject(user);
		return mav;
	}
	@RequestMapping("updateUser")
	public ModelAndView updateUser(@RequestParam int id)
	{
		ModelAndView mav = new ModelAndView("UpdateUser.jsp");
		User user = userdao.findById(id).orElse(new User());
		userdao.deleteById(id);		
		mav.addObject(user);
		return mav;
	}
}
