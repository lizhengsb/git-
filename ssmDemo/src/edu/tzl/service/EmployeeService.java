package edu.tzl.service;

import java.util.List;
import java.util.Map;

import edu.tzl.entity.Employee;

public interface EmployeeService {
	//登录
	Employee login(Employee e);
	
	//分页
	List<Employee> queryAll(Map<String,Object> map);
	
	//总行数
	int count();
	
	//根据id删除
	int deleteById(int id);
	
	//新增
	int add(Employee e);
	
	//根据id查询(修改)
	Employee getById(int id);
	
	//修改
	int update(Employee e);
}
