
//execution logic class
public class Test18 {
	
	public static void main(String[] args) {
		
		/*
		 * Employee employee = new Employee();
		 * 
		 * employee.setEmpid(-1000); employee.setEmpname("rk");
		 * 
		 * System.out.println("employee id is: " + employee.getEmpid());
		 * System.out.println("employee name is: " + employee.getEmpname());
		 */
		
		BankAccount bankAccount = new BankAccount("123456", 1000.0);
		
		//display the initial balance
		
		System.out.println("initial balance: " + bankAccount.getBalance());
		
		//Peform a deposit of 500
		double currentBalance = bankAccount.getBalance();
		
		bankAccount.setBalance(currentBalance + 500);
		
		System.out.println("after depositing 500, new balance: " + bankAccount.getBalance());
	
	   //perform a withdrawal of 300
		currentBalance = bankAccount.getBalance();
		bankAccount.setBalance(currentBalance - 300);
		System.out.println("after withdrawing 300, new balance : " + bankAccount.getBalance());
	
	
		//attempt to withdraw more than the available balance
		
		currentBalance = bankAccount.getBalance();
		
		bankAccount.setBalance(currentBalance - 1500);
		
		System.out.println("after attempting to withdraw 1500, new balance: " + bankAccount.getBalance());
	}

}
