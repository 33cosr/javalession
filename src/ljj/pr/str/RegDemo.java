package ljj.pr.str;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegDemo {

public static void main(String[] args) {
		
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		//demo6();
	
		 String s = "С�����ֻ�������189888888888�������ù�138123456789�����ù�176987654321";
		 // �����ֻ������������ʽ
		 String regex = "1[35768]\\d{9}"; // 1 3/5/6/7/8��ͷ��11λ�ֻ���
		 //ʹ��ģʽ��ƥ����
		 Pattern p = Pattern.compile(regex);
		 System.out.println(p);
		 Matcher m = p.matcher(s);
		 System.out.println("ƥ���������"+m.matches());
		 // ��ѯMatcher���API�������ҵ�find�����������������ֻ��ţ�����ѭ�����
		 while(m.find()) {
			 System.out.println(m.group()); //group�����Ƿ���ƥ����ַ���
			 System.out.println("***");
		 }	

	}
 
	public static void demo6() {
		String regex = "[abc]{2,5}";	// ����2��,���5��
		System.out.println("a".matches(regex)); // ƥ��1��
		System.out.println("ab".matches(regex)); // ƥ��2��
		System.out.println("abab".matches(regex)); // ƥ��4��
		System.out.println("ababc".matches(regex)); // ƥ��5��
		System.out.println("abcabc".matches(regex)); // ƥ��6��
	}
 
	public static void demo5() {
		String regex = "[abc]{2,}";	// ����2��
		System.out.println("a".matches(regex)); // ƥ��1��
		System.out.println("ab".matches(regex)); // ƥ��2��
		System.out.println("abc".matches(regex)); // ƥ��3��
		System.out.println("abbcde".matches(regex)); // ƥ��4��,����de�Ƿ�Χ���ַ�
		System.out.println("ababccab".matches(regex)); // ƥ��8��
	}
 
	public static void demo4() {
		String regex = "[abc]{3}";	// ǡ��3��
		System.out.println("a".matches(regex)); // ƥ��1��
		System.out.println("ab".matches(regex)); // ƥ��2��
		System.out.println("abc".matches(regex)); // ƥ��3��
		System.out.println("aaa".matches(regex)); // ƥ��3��
		System.out.println("cbc".matches(regex)); // ƥ��3��
	}
 
	public static void demo3() {
		String regex = "[abc]+";	//��ʾ1�����
		System.out.println("a".matches(regex)); // ƥ��1��
		System.out.println("ab".matches(regex)); // ƥ��a b��1��
		System.out.println("aabbcc".matches(regex)); 
		System.out.println("ab".matches(regex)); 
		System.out.println("".matches(regex)); // 0��ƥ�䲻�У�ֻ��һ��
	}
 
	public static void demo2() {
		String regex = "[abc]*";	//*��ʾ0�����
		System.out.println("a".matches(regex)); // ƥ��1��
		System.out.println("b".matches(regex)); // ƥ��1��
		System.out.println("d".matches(regex)); // a b c��Χ֮��
		System.out.println("c".matches(regex)); // ƥ��1��
		System.out.println("".matches(regex));  // ƥ��0��
	}
 
	public static void demo1() {
		String regex = "[abc]?";	//��ʾƥ��a b cһ�λ���û��
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex)); // d��a b c��Χ֮��
		System.out.println("".matches(regex));	// һ��Ҳû��
	}
}
