
public class Person {

	//private variables to store the person's details
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		if(age>0) {
			this.age=age;
		}
		else {
			System.out.println("age must be positive");
		}
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
}
