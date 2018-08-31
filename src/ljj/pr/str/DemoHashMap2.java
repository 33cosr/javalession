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
		Integer i1 = hm.put("����", 23);
		Integer i2 = hm.put("����", 24);
		Integer i3 = hm.put("����", 25);
		Integer i4 = hm.put("����", 30);
		Integer i5 = hm.put("����", 35);
	
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
		System.out.println("********��ֵ�Ա���**********");
		for(Map.Entry<String, Integer> en: hm.entrySet()) {
			System.out.println(en.getKey()+"="+en.getValue());
			
		}
		System.out.println("********��ֵ�Ա���**********");
		for(Entry<String, Integer> en: hm.entrySet()) {
			System.out.println(en.getKey()+"="+en.getValue());
			
		}
		
		test2();
		test3();
	}
	
	public static void test2() {
		HashMap<Student,String> hm = new HashMap<>();
		hm.put(new Student("����",23), "����");
		hm.put(new Student("����",23), "����");
		hm.put(new Student("����",24), "�Ϻ�");
		hm.put(new Student("����",33), "�Ͼ�");
		hm.put(new Student("����",23), "����");
		
		System.out.println(hm);
	}
	
	/*
	 * ͳ��ÿ���ַ����ֵĴ���������HashMapʵ�֣�
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
			//���ж�ʹ����Ԫ����
			hs.put(ch, !hs.containsKey(ch)?1:(hs.get(ch)+1));
		}
		
		System.out.println(hs);
	}
	
}
