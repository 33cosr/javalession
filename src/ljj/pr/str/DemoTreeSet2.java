package ljj.pr.str;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class DemoTreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� list���ϣ�����ظ�Ԫ��
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
	 * 1.�½�TreeSet���϶�����ΪString����߱ȽϹ��ܣ������ظ�Ԫ�ز��ᱣ������Ҫ�Զ���Ƚ���ʵ��
	 * ��list����ȫ����ӵ�TreeSet���ϣ��������򣬱����ظ�Ԫ��
	 * ���list����
	 * ��TreeSet����������õ�Ԫ����ӵ�list������
	 */
	
	public static void sort(List<String> list) {
		TreeSet<String> ts = new TreeSet<>(new ComparetorByString());
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}
	
	//��������֮�󣬿��ԴӼ���������ն��������ֱ������quit��ʱ�������룬��������������������������
	public static void test2() {
		//1. ����Scnner���󣬼���¼��
		Scanner sc = new Scanner(System.in);
		//2. ����TreeSet���϶��󣬴���Ƚ���
		TreeSet<Integer> ts = new TreeSet<>();
		
		//3. ����ѭ����������������quit�˳�������¼�붼���ַ�������
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
		System.out.println("������ѧ���ɼ�����ʽ�ǣ����������䣬���ĳɼ�����ѧ�ɼ���Ӣ��ɼ�");
		TreeSet<Student> ss = new TreeSet<>(new CompareByScore());
		while(ss.size()<5) {
			String line = sc.nextLine();
			String[] arr = line.split(",");
			//ת��Ϊint
			int age = Integer.parseInt(arr[1]);
			int chineseScore = Integer.parseInt(arr[2]);
			int mathScore = Integer.parseInt(arr[3]);
			int englishScore = Integer.parseInt(arr[4]);
			ss.add(new Student(arr[0],age,chineseScore,mathScore,englishScore));
		}
		System.out.println("������ ѧ��");
		for(Student student:ss) {
			System.out.println(student);
		}
	}
}
