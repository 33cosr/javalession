package ljj.pr.str;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = new ArrayList();
		li.add(new Student("张",23));
		li.add(new Student("李",24));
		li.add(new Student("王",25));
		li.add(new Student("赵",26));
		
		//iterator 遍历
		System.out.println("*********iterator 遍历*********");
		Iterator it = li.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//get(index)遍历
		System.out.println("*********get(index)遍历*********");
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
	}

}
