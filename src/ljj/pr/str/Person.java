package ljj.pr.str;

public class Person implements Comparable{
	private String name;
	private int age;
	
	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [name=" + name +",age="+ age + "]";
	}
	
//	@Override
//	
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		Person p = (Person) obj;
//		return this.name.equals(p.name)&&this.age==p.age;
//	}
//	
//	
//	@Override
//	public int hashCode() {
//		return 10;
//	}
//	
	public int getAge() {
		return age;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		//return 1;
		Person person = (Person)o;
//		int num=this.age-person.age;
//		return num==0?this.name.compareTo(person.name):num;
		
		int num=this.name.compareTo(person.name);
		return num==0?(this.age-person.age):num;
	}

	

	
}
