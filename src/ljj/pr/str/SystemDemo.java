package ljj.pr.str;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		long endTime = System.currentTimeMillis();
		System.out.println("start time: " + startTime);
		System.out.println("end time: " + endTime);
		
		int[] src = {20,34,90,239,100};
		int[] dest = new int[10];
		System.arraycopy(src, 0, dest, 0, 4);
		
		for(int i=0; i<dest.length; i++) {
			System.out.print(dest[i]+" ");
		}
		
		System.out.println("\n");
		
		BigInteger bg1 = new BigInteger("12345678910");
		BigInteger bg2 = new BigInteger("98765432189");
		System.out.println(bg1.add(bg2));
		
		BigDecimal bd1 = new BigDecimal("10.0");
		BigDecimal bd2 = new BigDecimal("7.9");
		System.out.println(bd1.subtract(bd2)); //得到的还是不够精确

		
	}

}
