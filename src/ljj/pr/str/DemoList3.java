package ljj.pr.str;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("c");
		list.add(34);
		list.add(34);
		list.add("d");
		list.add("d");
		System.out.println(list);
		System.out.println("*******after dedup********");
		System.out.println(getSingle(list));
		
	}
	
	//集合去重
	
	public static ArrayList getSingle(List list) {
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
