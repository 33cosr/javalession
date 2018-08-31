package ljj.sta;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[12];
		
		//引用数据类型数据创建， 100是数组长度
		String[] st = new String[100];
		
		int[] myArray;
		myArray = new int [10];
		
		int[] a = {40,20,50,10,60,30};
		//输出数组每个元素的位置和值
		System.out.println("第一种遍历数组元素方式");
		for(int i=0; i<a.length; i++) {
			System.out.println(i+ "\t"+a[i]);
		}
		//for循环遍历数组元素
		for(int x : a) {
			System.out.print("\t"+x);
		}
		System.out.println();
		//根据索引得到元素
		int b = Array.getInt(a, 2);
		System.out.println(b);
		
		//修改某一元素的值
	
		Array.set(a, 2, 80);
		System.out.println(Arrays.toString(a));
		System.out.println(a.toString());
		
		//排序从大到小  前提是利用前面已经排好的数组
		
		int len = a.length;
		for(int i=0; i<len/2; i++) {
			int temp = a[i];
			a[i]=a[len-1-i];
			a[len-1-i]=temp;
		}
		System.out.println("逆序后: "+ Arrays.toString(a));
	
		//比较2个数组是否相等
		int[] c = {60, 30 , 10, 80, 20, 40};
		System.out.println(Arrays.equals(a, c));
	}

}
