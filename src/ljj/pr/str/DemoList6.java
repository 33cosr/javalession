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
		//��ͨѭ��ɾ��
//		for(int i=0; i<list.size(); i++) {
//			System.out.println("*****����****"+i);
//			System.out.println("*****size****"+list.size());
//			if("hello".equals(list.get(i))) {
//				list.remove(i--);
//			}
//			System.out.println("*****����****"+i);
//			System.out.println("*****size****"+list.size());
//			System.out.println("+++++++++++++++++++++++");
//		}
		
		//������ɾ��
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
