package ljj.lang;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentA implements Student2 {

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		LinkedList<String> mylist = new LinkedList<String>();
		mylist.add("Tom");
		mylist.add("Tom2");
		mylist.add("Tom3");
		mylist.add("Tom4");
		mylist.add("Tom5");
		
		for(String x: mylist) {
			System.out.println(x);
		}
		
		System.out.println("Size= "+mylist.size());
		
		mylist.addFirst("Bob");
		
		mylist.addLast("Zara");
		
		// �������� �������һ�������һ���Ƿ���ȷ
		
		for(String x : mylist) {
			System.out.println(x);
		}
		
		mylist.removeLast();
		mylist.removeFirst();
		for(String x : mylist) {
			System.out.println(x);
		}
		mylist.clear();
		System.out.println("**************clear****************");
		for(String x : mylist) {
			System.out.println(x);
		}
		
	}

}
