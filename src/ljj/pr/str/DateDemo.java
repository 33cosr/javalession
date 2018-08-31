package ljj.pr.str;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//setTime();
		//showTime();
		//formatTime();
		Scanner sc = new Scanner(System.in);
	     System.out.println("请输入一个年份，判断是闰年还是平年");
	     int year = sc.nextInt();
	     boolean b = judgeLeapYear(year);
	     System.out.println(b);

	}
	
	public static boolean judgeLeapYear(int year) {
		//设置该年为3月1日 然后获取前一天的日期 是28还是29
		Calendar cd = Calendar.getInstance();
		cd.set(year, 2,1);
		cd.add(Calendar.DAY_OF_MONTH, -1);
		int m = cd.get(Calendar.DAY_OF_MONTH);
		String catStr = cd.get(Calendar.YEAR)+"年"+getNumber(cd.get(Calendar.MONTH))+"月"+getNumber(cd.get(Calendar.DAY_OF_MONTH))+"日";
		System.out.println(catStr);
		System.out.println(m);
		return m==29;
	}
	public static void formatTime() throws ParseException {
		Date dt = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String st = sdf.format(dt);
		Date dt1 = sdf.parse(st);
		String bds = "1993-08-17 8:8:8 8";
		Date birthDay = sdf.parse(bds);
		long dif = dt.getTime()-birthDay.getTime();
		System.out.println(st);
		System.out.println(dt1);
		System.out.println(birthDay);
		System.out.println(dif);
		System.out.println(dif/1000/60/60/24);
		
		Calendar cd = Calendar.getInstance();
		Calendar cd2 = Calendar.getInstance();
		cd.add(Calendar.MONTH, 2);
		cd2.set(2019, 10, 2);
		String catStr = cd.get(Calendar.YEAR)+"年"+getNumber(cd.get(Calendar.MONTH))+"月"+getNumber(cd.get(Calendar.DAY_OF_MONTH))+"日";
		String catStr2 = cd2.get(Calendar.YEAR)+"年"+getNumber(cd2.get(Calendar.MONTH))+"月"+getNumber(cd2.get(Calendar.DAY_OF_MONTH))+"日";
		
		System.out.println(catStr);
		System.out.println(catStr2);
	}
	
	/*
	 * 补0操作
	 */
	
	public static String getNumber(int num) {
		return (num>9)?""+num:"0"+num;
	}
	public static void setTime() {
		Date d1 = new Date();
		d1.setTime(5000);  //设置时间为5000毫秒，相当于5秒，改变时间对象
		System.out.println(d1); //设置毫秒值，改变时间对象	
	}
 
	public static void showTime() {
		Date d1 = new Date();
		System.out.println(d1.getTime()); //通过时间对象获取毫秒值
		System.out.println(System.currentTimeMillis()); //通过System的方法获取毫秒值
	}

	
}
