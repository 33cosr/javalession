package ljj.pr.str;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//圆周率PI
				System.out.println(Math.PI);
				//绝对值
				System.out.println(Math.abs(-60));
				//向上取整，结果是一个doble值
				System.out.println(Math.ceil(12.4));   //输出13.0
				//向下取整，结果是dobel值
				System.out.println(Math.floor(12.4));  //输出12.0
				
				//两个数求最大值
				System.out.println(Math.max(12, 6));
				//两个数求最小值
				System.out.println(Math.min(33, 20));
				
				//指数函数，n的m次方，参数和返回值都是double类型
				System.out.println(Math.pow(3, 4));
				
				//随机函数,随机生成0.0到1.0之间的随机小数
				System.out.println(Math.random());
				
				//四舍五入
				System.out.println(Math.round(12.4));
				System.out.println(Math.round(12.6));
				
				//求平方根（开平方）
				System.out.println(Math.sqrt(4));
				System.out.println(Math.sqrt(2));

	}

}
