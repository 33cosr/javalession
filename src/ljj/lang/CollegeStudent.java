package ljj.lang;

public class CollegeStudent extends Student {
	public int getAge() {
		return 30;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new CollegeStudent();
		System.out.println(st.getAge());
		Integer i = new Integer(8);
	}

}
