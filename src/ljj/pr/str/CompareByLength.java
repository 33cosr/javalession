package ljj.pr.str;

import java.util.Comparator;

public class CompareByLength implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		int num=s2.length()-s1.length();
		return num==0?s1.compareTo(s2):num;
	}

}
