package ljj.demo.exception;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	//����ʱ�쳣����Ҫ���� throws ���� try catch
//	public void setAge(int age) throws Exception {
//		if(age>0&&age<150) {
//			this.age = age;
//		}else {
//			//System.out.println("���䲻�Ϸ�");
//			throw new Exception("���䲻�Ϸ�");
//		}
//		
//	}
	//����ʱ�쳣
	public void setAge(int age)  {
	if(age>0&&age<150) {
		this.age = age;
	}else {
		//System.out.println("���䲻�Ϸ�");
		throw new RuntimeException("���䲻�Ϸ�");
	}
	
}

	
}
