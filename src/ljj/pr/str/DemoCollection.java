package ljj.pr.str;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student t1  = new Student("����",24);
		Collection c = new ArrayList();
		c.add(new Student("����",23));
		c.add(new Student("����",23));
		c.add(new Student("����",23));
		c.add(new Student("����",23));
		c.add(new Student("����",23));
		c.add(t1);
		Collection c1 = new ArrayList();
		c1.add("abc");
		c1.add(23);
		c1.add(t1);
		c.addAll(c1);
		//Boolean b = c.retainAll(c1);
		//System.out.println(b);
		/*
		Object[] arr = c.toArray();
		for(int i=0; i<arr.length; i++) {
			//System.out.println(((Student)arr[i]).getName());
			System.out.println(arr[i]);
		}
		*/
		//�Լ����е�Ԫ�ر��� 
		Iterator it = c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println("*****ɾ��*********");
		while(it.hasNext()) {
			System.out.println(it.next());
			//it.remove();
		}
		
	}

}
