package ljj.sta;

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodVarArgs(2,3,4,8,9,23,67);
	}

	 public static int methodVarArgs(int ...a){
		 
	        int total = 0;
	        for (int i= 0 ; i<a.length; i++) {
	 
	            total += a[i];
	        }
	 
	        System.out.println("total is "+ total);
	        return total;
	    }

	 
}
