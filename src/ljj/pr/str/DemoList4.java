package ljj.pr.str;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
		list.add(new Person("张三",23));
		list.add(new Person("张三",23));
		list.add(new Person("李四",24));
		list.add(new Person("李四",24));
		//System.arraycopy(list, 2, list2, 2, 2);
		System.out.println(list);
		System.out.println(list2);
		//list.remove(2);
		//System.out.println(getSingle(list));
	}
	
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newAList = new ArrayList();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			if(!newAList.contains(obj)) {
				newAList.add(obj);
			}
		}
		return newAList;
	}
}
