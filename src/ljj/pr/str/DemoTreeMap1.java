package ljj.pr.str;

import java.util.TreeMap;

public class DemoTreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Student,String> tm = new TreeMap<>();
		tm.put(new Student("����",23), "����");
		tm.put(new Student("����",18), "�Ϻ�");
		tm.put(new Student("����",31), "����");
		tm.put(new Student("����",43), "����");
		tm.put(new Student("����",23), "����");
		//System.out.println(tm.size());
		//System.out.println(tm);
	}
	
//	public static void test2() {
//		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {
//			 
//			@Override
//			public int compare(Student s1, Student s2) {
//				int num = s1.getName().compareTo(s2.getName());
//				return num == 0? s1.getAge() - s2.getAge() : num;
//			}
//			
//		});
//		tm.put(new Student("����",23), "����");
//		tm.put(new Student("����",18), "�Ϻ�");
//		tm.put(new Student("����",31), "����");
//		tm.put(new Student("����",43), "����");
//		tm.put(new Student("����",22), "����");
//		
//		System.out.println(tm);
//	}
}
