package ljj.pr.str;

import java.util.HashSet;

public class DemoHashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<>();
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");
		System.out.println(hs);
		System.out.println(b1);
		System.out.println(b2);
		for(String str:hs) {
			System.out.println(str);
		}
	}

}
