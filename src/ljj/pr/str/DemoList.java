package ljj.pr.str;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = new ArrayList();
		li.add(new Student("��",23));
		li.add(new Student("��",24));
		li.add(new Student("��",25));
		li.add(new Student("��",26));
		
		//iterator ����
		System.out.println("*********iterator ����*********");
		Iterator it = li.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//get(index)����
		System.out.println("*********get(index)����*********");
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
	}

}
