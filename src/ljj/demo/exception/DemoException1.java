package ljj.demo.exception;

public class DemoException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int[] arr = {12,34,90};
			try {
				int x = div(10,0);
				System.out.println(x);
			}catch(ArithmeticException a) {
				System.out.println("����Ϊ��");
			}catch(Exception e) {
				System.out.println("������");
			}
			
			try {
			System.out.println(arr[10]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("����Խ��");
			}catch(Exception e) {
				System.out.println("������");
			}
		
		
		
	}
	
	public static int div(int a, int b) {
		return a/b;
	}

}
