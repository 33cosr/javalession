package ljj.lang;

public class Student {
	String name;
	int age;
	static int NoOfStudents = 0;
	Student(){
		NoOfStudents++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return 0;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static int getNoOfStudents() {
		return NoOfStudents;
	}
	
	
}
