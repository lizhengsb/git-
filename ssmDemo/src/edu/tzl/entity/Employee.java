package edu.tzl.entity;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String empName;
	private String empPwd;
	private String empAge;
	private String empSex;
	private String empEdu;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPwd() {
		return empPwd;
	}

	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}

	public String getEmpAge() {
		return empAge;
	}

	public void setEmpAge(String empAge) {
		this.empAge = empAge;
	}

	public String getEmpSex() {
		return empSex;
	}

	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}

	public String getEmpEdu() {
		return empEdu;
	}

	public void setEmpEdu(String empEdu) {
		this.empEdu = empEdu;
	}

	
	public Employee(int id, String empName, String empPwd, String empAge,
			String empSex, String empEdu) {
		super();
		this.id = id;
		this.empName = empName;
		this.empPwd = empPwd;
		this.empAge = empAge;
		this.empSex = empSex;
		this.empEdu = empEdu;
	}

	
	public Employee(String empName, String empPwd, String empAge,
			String empSex, String empEdu) {
		super();
		this.empName = empName;
		this.empPwd = empPwd;
		this.empAge = empAge;
		this.empSex = empSex;
		this.empEdu = empEdu;
	}

	
	public Employee() {
		super();
	}

	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empPwd="
				+ empPwd + ", empAge=" + empAge + ", empSex=" + empSex
				+ ", empEdu=" + empEdu + "]";
	}
	
}
