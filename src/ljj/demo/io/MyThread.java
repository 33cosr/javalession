package ljj.demo.io;

public class MyThread extends Thread {
	public void run() {
		for(int i=0; i<1000;i++) {
			System.out.println("AAAAAAAAAAAAA");
		}
	}
}
