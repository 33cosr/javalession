package ljj.lang;

public class Hello {
	public static String name="jenny";
	
	public static void DoSomethingWithStatic(){
		System.out.println("调用了static方法");
	}
	
	public void DoSomethingWithNoStatic(){
		System.out.println("调用了非static方法");
	}
}
