package edu.tzl.dao;

import java.util.List;
import java.util.Map;

import edu.tzl.entity.Employee;

public interface employeeMapper {
	Employee login(Employee e);
	List<Employee> queryAll(Map<String,Object> map);
	int count();
	int deleteById(int id);
	int add(Employee e);
	Employee getById(int id);
	int update(Employee e);
}
