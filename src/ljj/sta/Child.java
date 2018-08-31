package ljj.sta;

public class Child extends Parent {
	static Foo FOO = new Foo("Child's static parameter");
	
	Foo foo = new Foo("Child's parameter");
	
	static {
		System.out.println("Child's static code block");
	}
	
	{
		System.out.println("Child's code block");
	}
	
	public Child() {
		System.out.println("Child.Child()");
	}
	
	
}
