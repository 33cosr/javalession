package ljj.pr.str;

import java.util.LinkedHashMap;

public class DemoLinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
		lhm.put("张三", 24);
		lhm.put("王五", 23);
		lhm.put("李四", 23);
		lhm.put("张三",27);
		System.out.println(lhm);
		
	}

}
