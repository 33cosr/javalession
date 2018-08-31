package ljj.demo.io;

import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("abc.txt");
		int x;
		
		while((x = fr.read())!=-1) {
			System.out.println((char)x);
		}
		fr.close();
	}
}
