package ljj.demo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class DemoBufferedReader1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
//		BufferedWriter bw = new BufferedWriter(new FileWriter("ljj.txt"));
//		
//		int c;
//		
//		while((c=br.read())!=-1) {
//			bw.write(c);
//		}
//		
//		br.close();
//		bw.close();
		
		
//		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
//		
//		String line;
//		while((line=br.readLine())!=null) {
//			System.out.println(line);
//		}
//		
//		br.close();
		
		
		//BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		LineNumberReader lnr = new LineNumberReader(new FileReader("abc.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("abc_2.txt"));
		
		String line;
		
		while((line = lnr.readLine())!=null) {
			bw.write(lnr.getLineNumber()+":"+ line);
			bw.newLine();
		}
		
		lnr.close();
		bw.close();
		
	}

}
