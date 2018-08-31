package ljj.pr.str;

import java.util.HashSet;

public class DemoHashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("张三",23));
		hs.add(new Person("张三",23));
		hs.add(new Person("张四",24));
		hs.add(new Person("张四",24));
		hs.add(new Person("张五",25));
		hs.add(new Person("张五",25));
		
		System.out.println(hs);
		
	}

}
