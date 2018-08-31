package ljj.demo.exception;

public class DemoFinally1 {

	public static void main(String[] args) {
		System.out.println(test1());
	}
 
	public static int test1() {
		int x = 10;
		
		try {
			x = 20;
			System.out.println(10/0);
			return x;
		} catch (Exception e) {
			x = 30;
			System.out.println("catchִ����");
			return x;
			
		} finally {
			x = 40;
			System.out.println("finallyִ����");
		}
		
	}


}
