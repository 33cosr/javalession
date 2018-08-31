package ljj.pr.str;

import java.util.Arrays;
import java.util.List;

public class DemoToList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//字符串转换为集合
		String[] arr = {"a","b","c","d","e","f"};
		//int [] arr2 = {2,3,4,5,32,2};
		Integer[] arr2 = {2,3,4,5,32,2};
		List<String> list = Arrays.asList(arr);
		List list2 = Arrays.asList(arr2);
	
		System.out.println(list);
		String[] arrNew = list.toArray(new String[0]);
		for(int i=0; i<arrNew.length; i++) {
			System.out.println(arr[i]+";");
		}
		//集合中只能存储引用数据类型，不能存储基本数据类型，
//		System.out.println(list2); //[[I@6d06d69c]
//		System.out.println(list2.toArray());
//		System.out.println(list2);
		
		
	}

}
