package ljj.pr.str;

import java.util.LinkedList;

public class DemoList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addLast("x");
		list.addLast("y");
		list.addLast("z");
		System.out.println(list);
		list.getFirst();
		list.getLast();
		list.get(2);
		list.removeFirst();
		list.removeLast();
		
	}

}
