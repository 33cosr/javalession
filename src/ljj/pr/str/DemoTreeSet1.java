package ljj.pr.str;

import java.util.TreeSet;

public class DemoTreeSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> ts = new TreeSet<>();
//		ts.add(1);
//		ts.add(5);
//		ts.add(3);
//		ts.add(4);
//		ts.add(1);
//		ts.add(2);
//		System.out.println(ts);
		ts.add(new Person("张三",29));
		ts.add(new Person("张三",23));
		ts.add(new Person("张四",20));
		ts.add(new Person("张五",21));
		System.out.println(ts);
		test1();
		test2();
	}
	
	
	public static void test1() {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("aaaaa");
		ts.add("z");
		ts.add("z");
		ts.add("nba");
		ts.add("beijing");
		System.out.println(ts);
	}
	
	public static void test2() {
		TreeSet<String> ts = new TreeSet<>(new CompareByLength());
		ts.add("aaaaa");
		ts.add("z");
		ts.add("z");
		ts.add("nba");
		ts.add("beijing");
		System.out.println(ts);
	}
}
