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
				lit.add("java");//注意用的是ListIterator 迭代器添加元素
			}
		}
		
		System.out.println(list);
		
		/*
		 * 如果前面我们不写hasNext()遍历，直接使用hasPrevious()，输出的是空白，因为一开始指针指向是索引0的元素，0前面肯定没有其他的元素，索引hasPrevious()返回是false，就不会继续while循环。这种反向遍历，在实际工作中应该没有什么作用，使用机会不多。剩下的remove()和set()就不联系，和前面的介绍的删除元素和修改元素一样的功能。
		 */
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
	}

}
