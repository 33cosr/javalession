package ljj.pr.str;

import java.util.ArrayList;
import java.util.Collections;

public class DemoCollections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("g");
		list.add("f");
		Collections.shuffle(list);
		System.out.println(list);
		test();
	}
	/*
	 * 模拟三人斗地主
	 */
	public static void test() {
		ArrayList<String> al = new ArrayList<>();
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] praise = {"红桃","方片","黑桃","梅花"};
		al.add("大王");
		al.add("小王");
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<praise.length; j++) {
				al.add(praise[j].concat(num[i]));
			}
		}
		//洗牌
		Collections.shuffle(al);
		System.out.println(al);
		
		//发牌 最后3张留作底牌 分发给3个人
		ArrayList<String> dipai = new ArrayList<>();
		ArrayList<String> mark = new ArrayList<>();
		ArrayList<String> jenny = new ArrayList<>();
		ArrayList<String> may = new ArrayList<>();
		
		for(int m=0; m<al.size();m++) {
			if(m>=al.size()-3) {
				dipai.add(al.get(m));
			}else if(m%3==0) {
				mark.add(al.get(m));
			}else if(m%3==1) {
				jenny.add(al.get(m));
			}else {
				may.add(al.get(m));
			}
		}
		
		System.out.println("mark "+mark);
		System.out.println("jenny "+jenny);
		System.out.println("may "+may);
		System.out.println("dipai "+dipai);
		
	}

}
