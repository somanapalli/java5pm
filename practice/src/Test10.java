
public class Test10 {
	
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			if(i==3) {
				continue;//skip the iteration when i equals 3
			}
			System.out.println(i);
		}
		System.out.println("loop ended.");
	}

}
