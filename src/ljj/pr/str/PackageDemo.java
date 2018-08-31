package ljj.pr.str;

public class PackageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//126-128
		 		Integer a = new Integer(200);
		        Integer b = new Integer(200);
		        //从jdk1.5开始引入了自动装箱和自动拆箱机制  相当于 Integer c = Integer.valueOf(200);
		        //Integer c = Integer.valueOf(200)
		        Integer c = 200;
		        Integer e = 200;
		        int d = 200;
		        String st="hello";
		       System.out.println("两个new出来的对象    ==判断"+(a==b));
		       System.out.println("两个new出来的对象    equal判断"+a.equals(b));
		       System.out.println("new出的对象和用int赋值的Integer   ==判断"+(a==c));
		       System.out.println("new出的对象和用int赋值的Integer   equal判断"+(a.equals(c)));
		       System.out.println("两个用int赋值的Integer    ==判断"+(c==e));
		       System.out.println("两个用int赋值的Integer    equal判断"+(c.equals(e)));
		       System.out.println("基本类型和new出的对象   ==判断"+(d==a));
		       System.out.println("基本类型和new出的对象   equal判断"+(a.equals(d)));
		       System.out.println("基本类型和自动装箱的对象   ==判断"+(d==c));
		       System.out.println("基本类型和自动装箱的对象   equal判断"+(c.equals(d)));

//int类型和Integer比较，会对Integer对象进行自动拆箱， 调用intValue方法
	}

}
