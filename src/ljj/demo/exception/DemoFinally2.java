package ljj.demo.exception;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class DemoFinally2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������");
		while(true) {
			String line = sc.nextLine();
			try {
				int num = Integer.parseInt(line);
				System.out.println(Integer.toBinaryString(num));
				break;
			}catch(Exception e) {
				try {
					new BigInteger(line);
					System.out.println("�����������������������һ������");
				}catch(Exception e1) {
					try {
						new BigDecimal(line);
						System.out.println("�������һ��С��������������һ��������");
					}catch(Exception e2) {
						System.out.println("������ǷǷ��ַ���������������");
					}
				}
			}
			
		}
	}

}
