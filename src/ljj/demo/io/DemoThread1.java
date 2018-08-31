package ljj.demo.io;

public class DemoThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyThread mt = new MyThread();
		//mt.start();
		
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();
		
		
		for(int i=0; i<1000; i++) {
			System.out.println("BBBBBB");
		}
	}

}
