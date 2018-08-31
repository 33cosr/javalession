package ljj.pr.str;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	private int chineseScore;
	private int mathScore;
	private int englishScore;
	private int totalScore;
	
	public Student() {
		super();
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Student(String name, int age, int chineseScore,int mathScore,int englishScore) {
		super();
		this.name=name;
		this.age=age;
		this.chineseScore=chineseScore;
		this.mathScore=mathScore;
		this.englishScore=englishScore;
		this.totalScore=this.chineseScore+this.mathScore+this.englishScore;
				
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getChineseScore() {
		return chineseScore;
	}

	public void setChineseScore(int chineseScore) {
		this.chineseScore = chineseScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	
	public int getTotalScore() {
		return totalScore;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Student [name=" + name + ",age=" + age 
				+",chineseScore="+chineseScore
				+",mathScore="+mathScore
				+",englishScore="+englishScore
				+",totalScore="+totalScore+"]";
		
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
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int num = this.age-o.age;
		return num==0?this.name.compareTo(o.name):num;
	}
}
