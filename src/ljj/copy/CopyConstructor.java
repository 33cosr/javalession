package ljj.copy;

public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(20,"Áõ¾§¾§");
		Person p2 = new Person(p1);
		System.out.println(p2);
		System.out.println(p1);
		p1.setAge(25);
		System.out.println(p1);
		System.out.println(p2);
	}

}
