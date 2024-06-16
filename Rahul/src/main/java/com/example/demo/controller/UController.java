package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.User;
import com.example.demo.dao.DAO;

@Controller
public class UController {
	@Autowired
	DAO dao;
	@RequestMapping("index")
	public String index()
	{
		return "index.jsp";
	}
	
	@RequestMapping("adduser")
	public String adduser(User user)
	{
		dao.save(user);
		return "index.jsp";
	}
	
	@RequestMapping("getuser")
	public ModelAndView getuser(@RequestParam int id)
	{
		ModelAndView mav = new ModelAndView("showdetails.jsp");
		User user = dao.findById(id).orElse(new User());
		mav.addObject(user);
		return mav;
	}
	@RequestMapping("deleteuser")
	public ModelAndView delete(@RequestParam int id)
	{
		ModelAndView mav = new ModelAndView("DeleteUser.jsp");
		User user = dao.findById(id).orElse(new User());
		dao.deleteById(id);
		mav.addObject(user);
		return mav;
	}
	@RequestMapping("updateuser")
	public ModelAndView update(@RequestParam int id)
	{
		ModelAndView mav = new ModelAndView("updatedetails.jsp");
		User user = dao.findById(id).orElse(new User());
		dao.deleteById(id);
		mav.addObject(user);
		return mav;
	}
	
}
