
public class Test11 {
	
	public void sum(int x, int y)
	{
		System.out.println("integer sum is: " +(x+y));
	}
	
	public void sum(double x, double y)
	{
		System.out.println("double sum is: " + (x+y));
	}

    public static void main(String[] args) {
    	int x;//x is a variable of int type
    	
		Test11 obj;//obj is also a variable of Test11 type
		obj= new Test11();//object referencing
		
		
		obj.sum(7, 6);
		obj.sum(4.5, 5.6);
    	
	}
}
