package ljj.copy;


 
class Body implements Cloneable{
    public Head head;
    //public Head2 head2;
    
    public Body() {}
 
    public Body(Head head) {
    	this.head = head; 
    	
    }
 
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Body newBody=(Body)super.clone();
        newBody.head=(Head)head.clone();
        return newBody;
    }
     
}

