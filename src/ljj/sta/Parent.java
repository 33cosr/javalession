package ljj.sta;

public class Parent {
	static Foo FOO = new Foo("Parent's static parameter");
	
	Foo foo = new Foo("parent's parameter");
	
	static {
		System.out.println("Parent's static code block");
	}
	
	{
		System.out.println("Parent's code block");
	}
	
	public Parent() {
		System.out.println("Parent.Parent()");
	}
}
