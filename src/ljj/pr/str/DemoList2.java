package ljj.pr.str;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("world");
		list.add(3.14);
	
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			if("world".equals(it.next())) {
				//list.remove(3.14);
			}
		}
		
		ListIterator lit = list.listIterator();
		
		while(lit.hasNext()) {
			if("world".equals(lit.next())) {
				lit.add("java");//ע���õ���ListIterator ���������Ԫ��
			}
		}
		
		System.out.println(list);
		
		/*
		 * ���ǰ�����ǲ�дhasNext()������ֱ��ʹ��hasPrevious()��������ǿհף���Ϊһ��ʼָ��ָ��������0��Ԫ�أ�0ǰ��϶�û��������Ԫ�أ�����hasPrevious()������false���Ͳ������whileѭ�������ַ����������ʵ�ʹ�����Ӧ��û��ʲô���ã�ʹ�û��᲻�ࡣʣ�µ�remove()��set()�Ͳ���ϵ����ǰ��Ľ��ܵ�ɾ��Ԫ�غ��޸�Ԫ��һ���Ĺ��ܡ�
		 */
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
	}

}
