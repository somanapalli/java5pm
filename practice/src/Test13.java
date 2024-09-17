
public class Test13 {

	public static void main(String[] args) {
		
		Person person = new Person("jagadeesh",23);
		
		System.out.println("name: " + person.getName());
		System.out.println("age:" + person.getAge());
		
		
		person.setName("rk");
		person.setAge(35);
		
		System.out.println("updated name: " + person.getName());
		System.out.println("updated age:" + person.getAge());
		
		person.setAge(-5);
	}
}
