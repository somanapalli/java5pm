
public class Test2 {
	
	
	int stid;
	String stname;
	//parameterized constructor 
	
	  public Test2(int stid, String stname)
	  {
		  this.stid=stid;
		  this.stname=stname;
	  }
	 
	public void display()
	{
		System.out.println("student id is:" + this.stid);
		System.out.println("student name is: " + this.stname);
	}
	
	public static void main(String[] args)
	{
		
		//create the object using parameterized constructor
		Test2 obj = new Test2(100,"ram");
		
		obj.display();
		
		
		
	}
	

}

	
	
	