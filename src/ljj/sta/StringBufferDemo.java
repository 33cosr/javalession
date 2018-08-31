package ljj.sta;

public class StringBufferDemo {
	
	private static final int ITERATIONS = 100000;
	private static final int BufferSize = 16;
	
	private void concatString() {
		
		System.out.print("concatString -> ");
		long startTime = System.currentTimeMillis();
		String concat = "";
		for(int i = 0; i<ITERATIONS; i++) {
			concat += i % 10;
			
		}
		
		
		long endTime = System.currentTimeMillis();
		System.out.print("length: " + concat.length());
		//循环统计整个过程时间
		System.out.println("time: " + (endTime - startTime));
	}
	
	// StringBuffer
	
	private void concatStringBuffer() {
		System.out.print("concatStringBuffer -> ");
		long startTime = System.currentTimeMillis();
		
		StringBuffer concat = new StringBuffer();
		for(int i=0; i<ITERATIONS; i++) {
			concat.append(i%10);
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.print("length:　" + concat.length());
		System.out.println("time: " +(endTime - startTime));
		
	}
	
	//StringBuilder
	private void concatStringBuilder() {
		System.out.print("concatStringBuilder -> ");
		long startTime = System.currentTimeMillis();
		
		StringBuilder concat = new StringBuilder();
		for(int i=0; i<ITERATIONS; i++) {
			concat.append(i%10);
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.print("length:　" + concat.length());
		System.out.println("time: " +(endTime - startTime));
		
	}
	
	public static void main(String[] args) {
		
		String str = new String("Hello ");
		str += "Beijing";
		StringBuffer strb = new StringBuffer("Hello ");
		strb.append("BeiJing");
		StringBuilder strd = new StringBuilder("Hello ");
		strd.append("BeiJing");
		
		StringBufferDemo st = new StringBufferDemo();
		
		System.out.println("Iterations: "+ITERATIONS);
		System.out.println("Buffer: "+BufferSize);
		st.concatString();
		st.concatStringBuffer();
		st.concatStringBuilder();
		
	}

}
