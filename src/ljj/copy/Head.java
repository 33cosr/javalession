package ljj.copy;

public class Head implements Cloneable{
	 public  Face face;
     
	    public Head() {}
	    public Head(Face face){this.face = face;}
	    @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

}
