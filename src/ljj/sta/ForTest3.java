package ljj.sta;

public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello World";
		String s2 = "Hello java";
		if(s1.equals(s2)) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
		
		if(s1.startsWith("He")) {
			System.out.println("begin with he");
		}
		
		if(s1.endsWith("world")) {
			System.out.println("end with world");
		}
		
		System.out.println("s1 中字母d的索引为 ：" + s1.indexOf("d"));
		System.out.println("索引从3到8的字符串为: " + s1.substring(3, 8));
		System.out.println("拼接到后面 " + s1.concat(s2));
		System.out.println("替换单个字母 " + s1.replace("l", "Z"));
		System.out.println("是否包含 world " + s1.contains("world"));
		
		System.out.println("根据空格切割  " + s1.split(" ")[0] + ";" +s1.split(" ")[1]);
		
	}

}
