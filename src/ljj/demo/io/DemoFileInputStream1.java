package ljj.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoFileInputStream1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("cba.txt");
		int b;
		
		while((b=fis.read())!=-1) {
			System.out.println(b);
		}
		fis.close();
	}

}
