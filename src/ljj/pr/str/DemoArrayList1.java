package ljj.pr.str;

import java.util.ArrayList;

public class DemoArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Person>> list = new ArrayList();
		ArrayList<Person> al1 = new ArrayList<Person>();
		al1.add(new Person("张三",23));
		al1.add(new Person("张四",24));
		al1.add(new Person("张五",25));
		
		ArrayList<Person> al2 = new ArrayList<Person>();
		al2.add(new Person("李三",23));
		al2.add(new Person("李四",24));
		al2.add(new Person("李五",25));
		
		list.add(al1);
		list.add(al2);
		for(ArrayList<Person> al:list) {
			for(Person p:al) {
				System.out.println(p.getName()+"..."+p.getAge());
			}
		}
	}

}
