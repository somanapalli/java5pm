
public class Test3 {
	
	//variable declaration 
	int x;
	String y;
	
	public void setValues()
	{
		//assignment
		x=100;
		y="Rama";
	}
	
	public void display()
	{
		System.out.println("student id is: " + x);
		System.out.println("student name is: " + y);
	}
	
	public static void main(String[] args) {
		
		Test3 obj = new Test3();
		
		//call setValues()
		obj.setValues();
		
		obj.display();
		
	}
	

}
