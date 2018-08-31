package ljj.pr.str;

import java.util.TreeMap;

public class DemoTreeMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Student,String> tm = new TreeMap<>();
		tm.put(new Student("张三",23), "北京");
		tm.put(new Student("李四",18), "上海");
		tm.put(new Student("王五",31), "广州");
		tm.put(new Student("赵六",43), "深圳");
		tm.put(new Student("张三",23), "深圳");
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
//		tm.put(new Student("张三",23), "北京");
//		tm.put(new Student("李四",18), "上海");
//		tm.put(new Student("王五",31), "广州");
//		tm.put(new Student("赵六",43), "深圳");
//		tm.put(new Student("张三",22), "深圳");
//		
//		System.out.println(tm);
//	}
}
