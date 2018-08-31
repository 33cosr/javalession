package ljj.pr.str;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Random r = new Random();
//		HashSet<Integer> hs = new HashSet<>();//注意集合里面存的是包装类 不是int
//		while(hs.size()<10) {
//			//生成1-20的随机数
//			//hs.add(r.nextInt(20)+1);//如果不加1，随机范围是0-19
//			hs.add(r.nextInt(21));
//		}
//		
//		//遍历 HashSet
//		for(Integer integer:hs) {
//			System.out.println(integer);
//		}
		//test2();
		test3();
	}
	
	//从键盘获取一行输入字符串，要求去除重复值
	public static void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一行字符串:");
		String line = sc.nextLine();
		char[] c = line.toCharArray();
		HashSet<Character> hs = new HashSet<>();
		for(int i=0; i<c.length; i++) {
			hs.add(c[i]);
		}
		
		for(Character character:hs) {
			System.out.println(character);
		}
	}
	
	//把list集合中的重复元素去除
	//调用一个去除重复元素的方法，LinkedHashSet实现
	public static void test3() {
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("world");
		System.out.println(list);
		System.out.println("********去重之后************");
		getSingle(list);
		System.out.println(list);
	}
	
	public static void getSingle(List<String> ls) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.addAll(ls);//
		System.out.println(lhs);
		ls.clear();
		ls.addAll(lhs);//将LinkedHashSet集合添加到list
	}
}
