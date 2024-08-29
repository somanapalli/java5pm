
public class Test1 {

	//non static variables or instance variable
	
	  int stid;
	  String stname;
	  float stmarks;
	  char grade;
	  boolean isActive;
	  static String collegeName;
	  
	
	  public static void display()
	  {
		
		  //static area
		  System.out.println("=======================================");
		  System.out.println("student id is: " + (new Test1().stid=200));
		  System.out.println("student name is:" +(new Test1().stname="rk"));
		  System.out.println("student marks are :" + (new Test1().stmarks=93.5f));
		  System.out.println("student grade is: " + (new Test1().grade='A'));
		  System.out.println("student is active or not?" + (new Test1().isActive=true));
		  
		  
	  }
	
	
   //main method 
	 public static void main(String[] args) {
		
		 //static area
		 //create the object
		 
		 Test1 suma = new Test1();
		 
		 suma.stid=100;
		 suma.stname="suma";
		 suma.stmarks=98.5f;
		 suma.grade='A';
		 suma.isActive=true;
		 collegeName="CBIT";
		
		 System.out.println("student id is: " + suma.stid);
		 System.out.println("student name is: " + suma.stname);
		 System.out.println("student marks are: " + suma.stmarks);
		 System.out.println("student grade is: " + suma.grade);
		 System.out.println("student is active or not?:" + suma.isActive);
		 System.out.println("student collegename is:" + suma.collegeName);
		
		 Test1 jd = new Test1();
		 jd.stid=101;
		 jd.stname="jagadeesh";
		 jd.stmarks=99.5f;
		 jd.grade='A';
		 jd.isActive=true;
		 collegeName="CBIT";
		 System.out.println("==============================================");
		 System.out.println("student id is: " + jd.stid);
		 System.out.println("student name is: " + jd.stname);
		 System.out.println("student marks are: " + jd.stmarks);
		 System.out.println("student grade is: " + jd.grade);
		 System.out.println("student is active or not?:" + jd.isActive);
		 System.out.println("student collegename is:" + jd.collegeName);
		 
		 
		 
		 //call display()
		 
		 display();
		 
		 
		 
	}
	
	
	
	
}
