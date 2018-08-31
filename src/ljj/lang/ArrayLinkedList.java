package ljj.lang;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = (long)1E6;
		System.out.println(n);
		ArrayList arrayList = new ArrayList();
		long milis = System.currentTimeMillis();
		for(int i=0; i< n; i++) {
			arrayList.add(i);
		}
		System.out.println("新增操作arrayList花费了 "+(System.currentTimeMillis()-milis)+"毫秒");
		
		LinkedList linkedList = new LinkedList();
		milis=System.currentTimeMillis();
		for(int i=0; i<n; i++) {
			linkedList.add(i);
		}
		
		System.out.println("新增操作linkedList花费了 "+(System.currentTimeMillis()-milis)+"毫秒");
		
	
	}

}
