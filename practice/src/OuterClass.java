
public class OuterClass {
	
	private String outerField="Outer Field";
	
	//member inner class
	class InnerClass{
		
		void display()
		{
			System.out.println("accessing outerclass field" + outerField);
		}
	}
	

	  public static void main(String[] args) {
		
		  OuterClass outer = new OuterClass();
		  InnerClass inner = outer.new InnerClass();
		  inner.display();
	}
}
