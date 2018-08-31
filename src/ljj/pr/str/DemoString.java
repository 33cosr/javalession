package ljj.pr.str;

import java.util.Arrays;
import java.util.Scanner;

public class DemoString {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(arr.toString());
		System.out.println(Arrays.toString(arr));
		//transform2(arr);
		
		//String st = "JennyLiuLiu";
		
		
		
//		Scanner sc = new Scanner(System.in);
//		String line = sc.nextLine();
//		sc.close();
//		StringBuffer sb = new StringBuffer(line);
//		sb.reverse();
//		System.out.println(sb.toString());
		
	}
	
	/*
	 * 字符串反转
	 */
	
	public static String myReverse(String str) {
		return "";
	}
	public static void demo2(String st, String sub) {
		int count = 0;
		int index = 0;
		while((index=st.indexOf(sub))!=-1) {
			count++;
			st=st.substring(index+sub.length());
		}
		System.out.println("出现次数："+count);
	}
	
	public static void demo1(String st, String sub) {
		int start_idx = 0;
		int cou = 0;
		
	
		if(st.contains(sub)) {
						
			while(st.indexOf(sub, start_idx)>=0) {
				start_idx = st.indexOf(sub, start_idx);
				start_idx += sub.length();
				cou++;
				if(start_idx > st.length()-1) {
					break;
				}
				//System.out.println(st.indexOf(sub, 0));
			}
		}else {
			System.out.println("不包含");
		}
		System.out.println(sub+ "在" +st+"中出现"+ cou+"次");
	}
	
	public static void transform2(int[] arr) {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		System.out.println("array length is "+ arr.length);
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				sb.append(arr[i]+"]");
			}else {
				//System.out.println("index is "+ i);
				sb.append(arr[i]+",");
			}
			
		}
		
		System.out.println(sb);
	}
	public static void transtorm(int[] arr) {
		String s = "[";
		
		for(int i = 0; i< arr.length; i++) {
			if(i == arr.length-1) {
				s+=arr[i]+"]";
			}else {
				s+=arr[i]+",";
			}
		}
		
		System.out.println(s);
	}
}
