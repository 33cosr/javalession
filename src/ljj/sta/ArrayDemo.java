package ljj.sta;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[12];
		
		//���������������ݴ����� 100�����鳤��
		String[] st = new String[100];
		
		int[] myArray;
		myArray = new int [10];
		
		int[] a = {40,20,50,10,60,30};
		//�������ÿ��Ԫ�ص�λ�ú�ֵ
		System.out.println("��һ�ֱ�������Ԫ�ط�ʽ");
		for(int i=0; i<a.length; i++) {
			System.out.println(i+ "\t"+a[i]);
		}
		//forѭ����������Ԫ��
		for(int x : a) {
			System.out.print("\t"+x);
		}
		System.out.println();
		//���������õ�Ԫ��
		int b = Array.getInt(a, 2);
		System.out.println(b);
		
		//�޸�ĳһԪ�ص�ֵ
	
		Array.set(a, 2, 80);
		System.out.println(Arrays.toString(a));
		System.out.println(a.toString());
		
		//����Ӵ�С  ǰ��������ǰ���Ѿ��źõ�����
		
		int len = a.length;
		for(int i=0; i<len/2; i++) {
			int temp = a[i];
			a[i]=a[len-1-i];
			a[len-1-i]=temp;
		}
		System.out.println("�����: "+ Arrays.toString(a));
	
		//�Ƚ�2�������Ƿ����
		int[] c = {60, 30 , 10, 80, 20, 40};
		System.out.println(Arrays.equals(a, c));
	}

}
