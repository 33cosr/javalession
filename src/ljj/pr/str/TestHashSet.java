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
//		HashSet<Integer> hs = new HashSet<>();//ע�⼯���������ǰ�װ�� ����int
//		while(hs.size()<10) {
//			//����1-20�������
//			//hs.add(r.nextInt(20)+1);//�������1�������Χ��0-19
//			hs.add(r.nextInt(21));
//		}
//		
//		//���� HashSet
//		for(Integer integer:hs) {
//			System.out.println(integer);
//		}
		//test2();
		test3();
	}
	
	//�Ӽ��̻�ȡһ�������ַ�����Ҫ��ȥ���ظ�ֵ
	public static void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���:");
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
	
	//��list�����е��ظ�Ԫ��ȥ��
	//����һ��ȥ���ظ�Ԫ�صķ�����LinkedHashSetʵ��
	public static void test3() {
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("world");
		System.out.println(list);
		System.out.println("********ȥ��֮��************");
		getSingle(list);
		System.out.println(list);
	}
	
	public static void getSingle(List<String> ls) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.addAll(ls);//
		System.out.println(lhs);
		ls.clear();
		ls.addAll(lhs);//��LinkedHashSet������ӵ�list
	}
}
