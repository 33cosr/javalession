package ljj.demo.io;

import java.io.File;
import java.io.IOException;

public class DemoFile1 {

	public static void main(String[] args) throws IOException {
		File file = new File("cba.txt");
		File dir = new File("C:\\Program Files");
		
		String[] arr = dir.list();
		File[] files = dir.listFiles();
		for(String string:arr) {
			System.out.println(string);
		}
		System.out.println("*****************");
		for(File fil:files) {
			System.out.println(fil);
		}
	}

}
