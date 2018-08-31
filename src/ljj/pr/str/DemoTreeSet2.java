package ljj.pr.str;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class DemoTreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义 list集合，添加重复元素
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("ffffff");
		list.add("bbbbbbbbbbb");
		list.add("cccccccccc");
		list.add("aaa");
		list.add("bbbb");
		list.add("bbbb");
		list.add("ccccc");
		list.add("ccccc");
		System.out.println(list);
		System.out.println("*****after sorting********");
		sort(list);
		System.out.println(list);
		//test2();
		test3();
	}
	
	/*
	 * 1.新建TreeSet集合对象，因为String本身具比较功能，但是重复元素不会保留，需要自定义比较器实现
	 * 将list集合全部添加到TreeSet集合，进行排序，保留重复元素
	 * 清空list集合
	 * 将TreeSet集合中排序好的元素添加到list集合中
	 */
	
	public static void sort(List<String> list) {
		TreeSet<String> ts = new TreeSet<>(new ComparetorByString());
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}
	
	//程序启动之后，可以从键盘输入接收多个整数，直到输入quit的时结束输入，把输入过的整数倒序排序输出。
	public static void test2() {
		//1. 创建Scnner对象，键盘录入
		Scanner sc = new Scanner(System.in);
		//2. 创建TreeSet集合对象，传入比较器
		TreeSet<Integer> ts = new TreeSet<>();
		
		//3. 无线循环接收整数，遇到quit退出，键盘录入都以字符串接收
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				break;
			}
			Integer i = Integer.parseInt(line);
			ts.add(i);
		}
		
		for(Integer integer : ts) {
			System.out.println(integer);
		}
	}
	
	
	public static void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生成绩，格式是：姓名，年龄，语文成绩，数学成绩，英语成绩");
		TreeSet<Student> ss = new TreeSet<>(new CompareByScore());
		while(ss.size()<5) {
			String line = sc.nextLine();
			String[] arr = line.split(",");
			//转换为int
			int age = Integer.parseInt(arr[1]);
			int chineseScore = Integer.parseInt(arr[2]);
			int mathScore = Integer.parseInt(arr[3]);
			int englishScore = Integer.parseInt(arr[4]);
			ss.add(new Student(arr[0],age,chineseScore,mathScore,englishScore));
		}
		System.out.println("排序后的 学生");
		for(Student student:ss) {
			System.out.println(student);
		}
	}
}
