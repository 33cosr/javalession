package ljj.pr.str;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoList6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("hello");
		list.add("hello");
		list.add("hello");
		list.add("world");
		list.add("world");
		//普通循环删除
//		for(int i=0; i<list.size(); i++) {
//			System.out.println("*****次数****"+i);
//			System.out.println("*****size****"+list.size());
//			if("hello".equals(list.get(i))) {
//				list.remove(i--);
//			}
//			System.out.println("*****次数****"+i);
//			System.out.println("*****size****"+list.size());
//			System.out.println("+++++++++++++++++++++++");
//		}
		
		//迭代器删除
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String item = it.next();
			if("hello".equals(item)) {
				it.remove();
				//list.remove(item);//.ConcurrentModificationException
			}
		}
		System.out.println(list);
		
		
		
	}

}
