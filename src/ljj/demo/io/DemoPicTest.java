package ljj.demo.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoPicTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//FileInputStream fis = new FileInputStream("copy.jpg");
		//FileOutputStream fos = new FileOutputStream("123.jpg");
		FileInputStream fis = new FileInputStream("123.jpg");
		FileOutputStream fos = new FileOutputStream("321.jpg");
		
		int b;
		while((b=fis.read())!=-1){
			fos.write(b^123);
		}
		fis.close();
		fos.close();
	}

}
