package ljj.demo.io;

import java.math.BigInteger;

public class DemoDigui2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//쳲��������� f(n)=f(n-1)+f(n-2)
		//System.out.println(fun(7));
		//�����������쳲���������
//		int[] arr = new int[7]; //��ʱ����߸���
//		arr[0]=1;
//		arr[1]=1;
//		
//		//�����������Ԫ�ظ�ֵ���ӵ������¿�ʼ���㣬����������2
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
	 * �õݹ���Ʋ���������
	 */
	
	public static int fun(int num) {
		if(num==1 || num==2) {
			return 1;
		}else {
			return fun(num-1)+fun(num-2);
		}
	}
	
	/*
	 * ����1000�Ľ׳�
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
	 * ����ȫ��0�ĸ���
	 */
	
	public static int getAllNum(BigInteger bi) {
		//BigInteger ת���ַ���������ʽ
		
		String s1 = bi.toString();
		System.out.println(s1);
		
		//����һ��������
		int count=0;
		
		//�����õ��ַ���ÿһ���ַ����ж��Ƿ���0
		for(int i=0; i<s1.length(); i++) {
			if('0'==s1.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	
	/*
	 * ����β���ĸ���
	 * ��Ҫ���ַ�����ת������β����0�����ַ���ǰ����ʾ
	 * Ȼ������ַ���ÿһ���֣��Ƿ���ַ�0��ȣ��Ǽ�����+1������break
	 */
	public static int getTailNum(BigInteger bi) {
		
		//�ַ���ʵ�ַ�ת����Ҫ����StringBuffer��reverse����
		StringBuffer sb = new StringBuffer(bi.toString());
		//��ת֮���ַ���
		String s2 = sb.reverse().toString();
		
		//���������
		int num=0;
		//����
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
