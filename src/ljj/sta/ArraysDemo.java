package ljj.sta;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] a = {"Beijing", "ShangHai", "HeBei", "GuangZhou", "XiAn"};
	        String[] b = a.clone();
	 
	        System.out.println(a == b);
	        //证明a发生变化，b会不会也变化
	        Array.set(a,2,"WuHan");
	        System.out.println("a "+Arrays.toString(a));
	        System.out.println("b "+Arrays.toString(b));


	}

}
