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
	//编译时异常必须要处理 throws 或者 try catch
//	public void setAge(int age) throws Exception {
//		if(age>0&&age<150) {
//			this.age = age;
//		}else {
//			//System.out.println("年龄不合法");
//			throw new Exception("年龄不合法");
//		}
//		
//	}
	//运行时异常
	public void setAge(int age)  {
	if(age>0&&age<150) {
		this.age = age;
	}else {
		//System.out.println("年龄不合法");
		throw new RuntimeException("年龄不合法");
	}
	
}

	
}
