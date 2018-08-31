package ljj.demo.io;

import java.io.FileWriter;
import java.io.IOException;

public class DemoWriter1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("cba.txt");
		fw.write("ÄãºÃ£¬ÉµÐ¡Æß");
		fw.write("\n");
		fw.write(97);
		
		fw.close();
	}

}
