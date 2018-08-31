package ljj.pr.str;

import java.util.Map;
import java.util.TreeMap;

public class CharCountMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "ADHfggegJKEFdjiwDdgrgrgfGgrgrRd";
		//用Map实现
		TreeMap<Character,Integer> map = new TreeMap<Character,Integer>();
		//str1.toCharArray()
		for(Character ch: str1.toCharArray()) {
			if(ch>='a' && ch<='z'|| ch>='A'&&ch<='Z') {
				Integer count = map.get(ch);
				map.put(ch, (null==count)?1:count+1);
			}
		}
		
		for(Map.Entry<Character, Integer> enter: map.entrySet()) {
			System.out.println("字母："+enter.getKey()+" 出现次数:"+enter.getValue());
		}
	}

}
