package edu.tzl.service.imp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.tzl.dao.employeeMapper;
import edu.tzl.entity.Employee;
import edu.tzl.service.EmployeeService;

@Transactional(propagation =Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("EmployeeService")
public  class EmployeeServiceImp implements EmployeeService{

	@Autowired
	private employeeMapper employeeMapper;
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public Employee login(Employee e) {
		return this.employeeMapper.login(e);
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public List<Employee> queryAll(Map<String,Object> map) {
		return this.employeeMapper.queryAll(map);
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public int count() {
		return this.employeeMapper.count();
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public int deleteById(int id) {
		return this.employeeMapper.deleteById(id);
		
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	@Override
	public int add(Employee e) {
		return this.employeeMapper.add(e);
	}
	
	@Override
	public Employee getById(int id){
		return this.employeeMapper.getById(id);
	}

	@Override
	public int update(Employee e) {
		return this.employeeMapper.update(e);
	}
}
