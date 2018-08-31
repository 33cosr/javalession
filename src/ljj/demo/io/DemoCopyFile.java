package ljj.demo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DemoCopyFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//1. create inputstream object
		FileInputStream fis = new FileInputStream("C:\\Users\\jjiliu\\Desktop\\qiqi.jpg");
		//2. create outputstream object
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		
		
		//�����������������������а�װ
		BufferedInputStream bis = new BufferedInputStream(fis);
		//����������������������а�װ
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//3.  read 
		int b;
		//
		//4. write
		while((b=bis.read())!=-1) {
			bos.write(b);
		}
		
		//5. close inputstream
		bis.close();
		//6. close outputstream
		bos.close();
	}

}
