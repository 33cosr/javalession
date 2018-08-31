package ljj.demo.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoCopy1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
	
		try {
			fis = new FileInputStream("cba.txt");
			fos = new FileOutputStream("abc.txt");
			
			int b;
			
			while((b=fis.read())!=-1) {
				fos.write(b);
				System.out.println(b);
			}
		} finally  {
			try {
				if (fis != null) {
					fis.close();
				} 
			} finally {
				// TODO: handle finally clause
				if(fos!=null) {
					fos.close();
				}
			}
		}
	}

}
