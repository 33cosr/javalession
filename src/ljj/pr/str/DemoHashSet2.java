package ljj.pr.str;

import java.util.HashSet;

public class DemoHashSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("����",23));
		hs.add(new Person("����",23));
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		hs.add(new Person("����",25));
		hs.add(new Person("����",25));
		
		System.out.println(hs);
		
	}

}
