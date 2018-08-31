package ljj.pr.str;

import java.util.HashMap;

public class DemoHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm = new HashMap<>();
		Integer i1 = hm.put("张三", 23);
		Integer i2 = hm.put("张四", 24);
		Integer i3 = hm.put("张五", 25);
		Integer i4 = hm.put("张三", 30);
		Integer i5 = hm.put("张三", 35);
		System.out.println(hm);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		hm.remove("张四");
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		hm.clear();
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		
	}

}
