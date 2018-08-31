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
	
		 String s = "小明的手机号码是189888888888，曾经用过138123456789，还用过176987654321";
		 // 定义手机号码的正则表达式
		 String regex = "1[35768]\\d{9}"; // 1 3/5/6/7/8开头的11位手机号
		 //使用模式和匹配器
		 Pattern p = Pattern.compile(regex);
		 System.out.println(p);
		 Matcher m = p.matcher(s);
		 System.out.println("匹配个数：："+m.matches());
		 // 查询Matcher类的API，可以找到find方法，上面有三个手机号，这里循环输出
		 while(m.find()) {
			 System.out.println(m.group()); //group方法是返回匹配的字符串
			 System.out.println("***");
		 }	

	}
 
	public static void demo6() {
		String regex = "[abc]{2,5}";	// 至少2次,最多5次
		System.out.println("a".matches(regex)); // 匹配1次
		System.out.println("ab".matches(regex)); // 匹配2次
		System.out.println("abab".matches(regex)); // 匹配4次
		System.out.println("ababc".matches(regex)); // 匹配5次
		System.out.println("abcabc".matches(regex)); // 匹配6次
	}
 
	public static void demo5() {
		String regex = "[abc]{2,}";	// 至少2次
		System.out.println("a".matches(regex)); // 匹配1次
		System.out.println("ab".matches(regex)); // 匹配2次
		System.out.println("abc".matches(regex)); // 匹配3次
		System.out.println("abbcde".matches(regex)); // 匹配4次,但是de是范围外字符
		System.out.println("ababccab".matches(regex)); // 匹配8次
	}
 
	public static void demo4() {
		String regex = "[abc]{3}";	// 恰好3次
		System.out.println("a".matches(regex)); // 匹配1次
		System.out.println("ab".matches(regex)); // 匹配2次
		System.out.println("abc".matches(regex)); // 匹配3次
		System.out.println("aaa".matches(regex)); // 匹配3次
		System.out.println("cbc".matches(regex)); // 匹配3次
	}
 
	public static void demo3() {
		String regex = "[abc]+";	//表示1到多次
		System.out.println("a".matches(regex)); // 匹配1次
		System.out.println("ab".matches(regex)); // 匹配a b各1次
		System.out.println("aabbcc".matches(regex)); 
		System.out.println("ab".matches(regex)); 
		System.out.println("".matches(regex)); // 0次匹配不行，只是一次
	}
 
	public static void demo2() {
		String regex = "[abc]*";	//*表示0到多次
		System.out.println("a".matches(regex)); // 匹配1次
		System.out.println("b".matches(regex)); // 匹配1次
		System.out.println("d".matches(regex)); // a b c范围之外
		System.out.println("c".matches(regex)); // 匹配1次
		System.out.println("".matches(regex));  // 匹配0次
	}
 
	public static void demo1() {
		String regex = "[abc]?";	//表示匹配a b c一次或者没有
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex)); // d在a b c范围之外
		System.out.println("".matches(regex));	// 一次也没有
	}
}
