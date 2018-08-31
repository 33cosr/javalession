package ljj.demo.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class DemoFinally2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		while(true) {
			String line = sc.nextLine();
			try {
				int num = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(num));
				break;
			}catch(Exception e) {
				try {
					new BigInteger(line);
					System.out.println("输入的整数过大，请重新输入一个整数");
				}catch(Exception e1) {
					try {
						new BigDecimal(line);
						System.out.println("输入的是一个小数，请重新输入一个整数！");
					}catch(Exception e2) {
						System.out.println("输入的是非法字符串，请重新输入");
					}
				}
			}
			
		}
	}

}
