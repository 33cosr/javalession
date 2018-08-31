package ljj.pr.str;

import java.util.Comparator;

public class CompareByScore implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int num = o2.getTotalScore()-o1.getTotalScore();
		return num==0?1:num;
		// TODO Auto-generated method stub
		
	}

}
