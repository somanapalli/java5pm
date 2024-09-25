
public class Test17 {
	
	public static void main(String[] args) {
		
		//runtime polymorphism 
		/*
		 * Test14 obj; obj= new Test16();
		 * 
		 * obj.sum(4, 5); obj.sub(6, 5);
		 */
		//runtime polymorphism
		/*
		 * Animal cat = new Dog(); cat.sleep(); cat.sound();
		 */
		/*
		 * i1Impl obj = new i1Impl(); obj.sum(4, 5); obj.sub(6,5);
		 */
		Bank obj = new Icici();
		if(obj instanceof Icici) {
		System.out.println("ICICI rateofinterest is: " + obj.getRateOfInterest());
		}
		else if(obj instanceof SBI)
		{
			System.out.println("SBI rateofinterst is: " + obj.getRateOfInterest());
		}
		
	}

}
