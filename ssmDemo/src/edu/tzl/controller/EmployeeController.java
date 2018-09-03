package edu.tzl.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.tzl.entity.Employee;
import edu.tzl.entity.PaperHelp;
import edu.tzl.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	
	//登录
	@RequestMapping("/login")
	public ModelAndView login(@ModelAttribute ("Employee") Employee e,HttpServletRequest request){
		System.out.println(e);
		Employee s=this.employeeService.login(e);
		if(s!=null){
			request.getSession().setAttribute("emp", s);
			
			return this.queryAll(request);
		}else{
			return new ModelAndView("index","msg","登录账号和密码不匹配");
		}	
	}
	
	
	//分页查询
	@RequestMapping("/queryAll")
	public ModelAndView queryAll(HttpServletRequest reqeust){
		String nowPage=reqeust.getParameter("nowPage");
		if(nowPage==null){
			nowPage="1";
		}
		int pageRow=5;
		int totalRow=this.employeeService.count();
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("_pagecurrent", nowPage);
		map.put("_pagesize", pageRow);
		map.put("_ifelse", "*");
		map.put("_where", "employee");
		map.put("_order", "order by id asc");
		List<Employee> list=this.employeeService.queryAll(map);
		PaperHelp ph=new PaperHelp(pageRow, totalRow, Integer.valueOf(nowPage), list);
		return new ModelAndView("list","ph",ph);
	}
	
	
	//删除
	@RequestMapping("/deleteById")
	public ModelAndView deleteById(HttpServletRequest request){
		int id=Integer.valueOf(request.getParameter("id"));
		System.out.println(id);
		this.employeeService.deleteById(id);
		return this.queryAll(request);
	}
	
	//新增
	@RequestMapping("/add")
	public ModelAndView add(@ModelAttribute("Employee") Employee e,HttpServletRequest reqeust){
		System.out.println(e);
		this.employeeService.add(e);
		return this.queryAll(reqeust);
	}
	
	//根据id 查询
	@RequestMapping("getById")
	public ModelAndView getById(HttpServletRequest request){
		int id=Integer.valueOf(request.getParameter("id"));
		Employee e=this.employeeService.getById(id);
		return new ModelAndView("update","e",e);
	}
	
	//修改
	@RequestMapping("update")
	public ModelAndView update(@ModelAttribute("Employee") Employee e,HttpServletRequest request){
		System.out.println(e);
		this.employeeService.update(e);
		return this.queryAll(request);
	}	
	
	
	
	
	
}
