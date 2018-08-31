package ljj.pr.str;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm = new HashMap<>();
		Integer i1 = hm.put("张三", 23);
		Integer i2 = hm.put("张四", 24);
		Integer i3 = hm.put("张五", 25);
		Integer i4 = hm.put("张三", 30);
		Integer i5 = hm.put("张三", 35);
	
		Set<String> set = hm.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = hm.get(key);
			System.out.println(key+"="+value);
		}
		
		for(String key:hm.keySet()) {
			System.out.println(key+"="+hm.get(key));
		}
		System.out.println("********键值对遍历**********");
		for(Map.Entry<String, Integer> en: hm.entrySet()) {
			System.out.println(en.getKey()+"="+en.getValue());
			
		}
		System.out.println("********键值对遍历**********");
		for(Entry<String, Integer> en: hm.entrySet()) {
			System.out.println(en.getKey()+"="+en.getValue());
			
		}
		
		test2();
		test3();
	}
	
	public static void test2() {
		HashMap<Student,String> hm = new HashMap<>();
		hm.put(new Student("张三",23), "北京");
		hm.put(new Student("张三",23), "广州");
		hm.put(new Student("张四",24), "上海");
		hm.put(new Student("张五",33), "南京");
		hm.put(new Student("张三",23), "深圳");
		
		System.out.println(hm);
	}
	
	/*
	 * 统计每个字符出现的次数，利用HashMap实现，
	 */
	public static void test3() {
		String str = "sjdkfl3284230((((dkuskdew";
		char[] arr = str.toCharArray();
		HashMap<Character,Integer> hs = new HashMap<>();
		for(char ch:arr) {
//			if(hs.containsKey(ch)) {
//				hs.put(ch, hs.get(ch)+1);
//			}else {
//				hs.put(ch, 1);
//			}
			//简单判断使用三元运算
			hs.put(ch, !hs.containsKey(ch)?1:(hs.get(ch)+1));
		}
		
		System.out.println(hs);
	}
	
}
