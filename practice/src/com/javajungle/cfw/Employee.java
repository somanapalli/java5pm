package com.javajungle.cfw;

public class Employee {
	
	private Integer empid; 
	private String empname;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Employee(Integer empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + "]";
	}
	

}
