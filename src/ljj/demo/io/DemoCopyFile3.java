package ljj.demo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DemoCopyFile3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 1. ���̶���
		Scanner sc = new Scanner(System.in);
		// 2. ������������󣬹���abc.txt
		FileOutputStream fos = new FileOutputStream("abc.txt",true);
		// 3. ��������ѭ����ֱ��ȡ��quit break
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				break;
			}else {
				fos.write(line.getBytes());
				fos.write("\r\n".getBytes());
			}
		}
		// 4. �ر������
	}

}
