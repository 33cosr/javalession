package ljj.demo.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DemoCopyFile2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = getFile();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy_"+file.getName()));
		System.out.println(file.getName());
		int b;
		while((b=bis.read())!=-1) {
			bos.write(b);
		}
		bis.close();
		bos.close();
	}

	/*
	 * ����һ��������ȡ����¼����ļ�·�������Է�װ��File���η���
	 * 1.����ֵ����File
	 * 2.����Ϊ��
	 * @return
	 */
	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String line = sc.nextLine();
			File file = new File(line);
			if(!file.exists()) {
				System.out.println("the file not exist, please input again");
			}else if(file.isDirectory()) {
				System.out.println("the file is a directory,please input again");
			}else {
				return file;
			}
		}
	}
}
