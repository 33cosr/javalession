package ljj.sta;

public class Widget {
	private int id;
    private static int numberOfWidgets = 0;
    static{
    	System.out.println("��̬�����" + numberOfWidgets);
    }
    public Widget(){
        // numberOfWidget��������Ȼ���Ƹ�����id
        System.out.println("���ʵ���ڳ�ʼ����ʱ����ִ�й��췽��");
        id = ++numberOfWidgets;
    }
   
    // �½�һ��ʵ������������ʵ������id��ֵ
    public int getID(){
        return id;
    }
 
    //�½�һ����̬����
    public static int getAvailablWidgets(){
        return numberOfWidgets;
    }

}
