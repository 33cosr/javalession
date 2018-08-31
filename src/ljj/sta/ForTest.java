package ljj.sta;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 10;
		short s = 10;
		int i = 300;
		long l = 10L;
		float f = 234.5f;
		double d = 123.4;
		char c = 'A';
		boolean bool=true;
		String s1="ljj";
		//Java 引用类型 或者叫类对象类型
		
		Byte myByte = new Byte("10");
		Short myShort = new Short(s);
		Integer myInteger = Integer.valueOf(i);
		Long myLong;
		Float myFloat;
		Double myDouble=Double.valueOf(d);
		Character myCharacter;
		Boolean myBoolean;
		System.out.println(myInteger);
	}

}
