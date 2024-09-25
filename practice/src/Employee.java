
public class Employee {

	//variables declaration
	private int empid;
	private String empname;
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		
		if(empid>=0) {
		this.empid = empid;
		}
		else
		{
			System.out.println("employee id should be positive number");
		}
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}





	//method to display the employee data
	public void display()
	{
		System.out.println("employee id is: " + empid);
		System.out.println("employee name is: " + empname);
	}
	
	
	
}
