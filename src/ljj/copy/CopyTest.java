package ljj.copy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		 String[] a = {"Beijing", "ShangHai", "HeBei", "GuangZhou", "XiAn"};
	        String[] b = Arrays.copyOf(a, a.length);
	 
	        System.out.println(a == b);
	        //֤��a�����仯��b�᲻��Ҳ�仯
	        Array.set(a,2,"WuHan");
	        System.out.println("a "+Arrays.toString(a));
	        System.out.println("b "+Arrays.toString(b));



	}

}
