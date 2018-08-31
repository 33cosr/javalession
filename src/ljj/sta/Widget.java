package ljj.sta;

public class Widget {
	private int id;
    private static int numberOfWidgets = 0;
    static{
    	System.out.println("静态代码块" + numberOfWidgets);
    }
    public Widget(){
        // numberOfWidget先自增，然后复制给变量id
        System.out.println("类的实例在初始化的时候先执行构造方法");
        id = ++numberOfWidgets;
    }
   
    // 新建一个实例方法，返回实例变量id的值
    public int getID(){
        return id;
    }
 
    //新建一个静态方法
    public static int getAvailablWidgets(){
        return numberOfWidgets;
    }

}
