package com.javajungle.cfw;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return -o2.getEmpid().compareTo(o1.getEmpid());
	}

}
