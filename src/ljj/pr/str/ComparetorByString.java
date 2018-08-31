package ljj.pr.str;

import java.util.Comparator;

public class ComparetorByString implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		int num=s1.compareTo(s2);
		return num==0?1:num;
	}
	
	

}
