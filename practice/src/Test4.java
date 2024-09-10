
public class Test4 {
	//class level variables
	int stid;
	String stname;

	//user defined parameterized constructor 
	public Test4(int stid, String stname)
	{
		 this();
	   System.out.println("parameterized constructor");
	  
	}
	
	//default constructor
	public  Test4()
	{
		
		System.out.println("default constructor");
	}
	
	
	public static void main(String[] args) {
	
		Test4 obj1 = new Test4(100,"rk");
		
		
		
		
	}

}
