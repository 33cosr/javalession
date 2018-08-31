package ljj.demo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoByteString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("cba.txt",true);
		//int 100
		fos.write(97);
		fos.write(100);
		fos.write(97);
		fos.write(139);
		fos.close();
	}
	
	
	
}
