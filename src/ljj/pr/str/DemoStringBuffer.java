package ljj.pr.str;

public class DemoStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringbuffer 同步的 线程安全的
		StringBuffer sb = new StringBuffer("JennyLiu");
		System.out.println(sb.length());
		System.out.println(sb.capacity());//
		sb.reverse();
		System.out.println(sb);
		
	}

}
