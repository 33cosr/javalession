package ljj.demo.io;

import java.math.BigInteger;

public class DemoDigui2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//斐波那契数列 f(n)=f(n-1)+f(n-2)
		//System.out.println(fun(7));
		//用数组对象做斐波那契数列
//		int[] arr = new int[7]; //暂时算第七个月
//		arr[0]=1;
//		arr[1]=1;
//		
//		//遍历数组对其元素赋值，从第三个月开始计算，所以索引是2
//		for(int i=2; i<arr.length; i++) {
//			arr[i]= arr[i-1]+arr[i-2];
//		}
//		
//		System.out.println(arr[arr.length-1]);
		//BigInteger bi = mul();
		//System.out.println(bi.toString());
		System.out.println(getAllNum(mul()));
		System.out.println(getTailNum(mul()));
	}
	
	/*
	 * 用递归求菲波那切数列
	 */
	
	public static int fun(int num) {
		if(num==1 || num==2) {
			return 1;
		}else {
			return fun(num-1)+fun(num-2);
		}
	}
	
	/*
	 * 计算1000的阶乘
	 */
	
	public static BigInteger mul() {
		BigInteger bi1 = new BigInteger("1");
		for(int i=1; i<=1000; i++) {
			
			BigInteger bi2 = new BigInteger(i+"");
			//System.out.println(bi2);
			//System.out.println(bi2.toString());
			bi1=bi1.multiply(bi2);
		}
		
		return bi1;
	}
	
	/*
	 * 计算全部0的个数
	 */
	
	public static int getAllNum(BigInteger bi) {
		//BigInteger 转成字符串表现形式
		
		String s1 = bi.toString();
		System.out.println(s1);
		
		//定义一个计数器
		int count=0;
		
		//依次拿到字符串每一个字符，判断是否是0
		for(int i=0; i<s1.length(); i++) {
			if('0'==s1.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * 计算尾部的个数
	 * 需要把字符串反转过来，尾部的0都在字符串前面显示
	 * 然后遍历字符串每一个字，是否和字符0相等，是计数器+1，否则break
	 */
	public static int getTailNum(BigInteger bi) {
		
		//字符串实现反转，需要利用StringBuffer的reverse方法
		StringBuffer sb = new StringBuffer(bi.toString());
		//反转之后字符串
		String s2 = sb.reverse().toString();
		
		//定义计数器
		int num=0;
		//遍历
		for(int i=0; i<s2.length(); i++) {
			if('0'!=s2.charAt(i)) {
				break;
			}else {
				num++;
			}
		}
		
		return num;
	}
}
