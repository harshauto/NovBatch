package package1;

public class Assignment3 {
	
	public Assignment3()
	{
		this(10,20,30);
		System.out.println("Default Constructor");
	}
	
	public Assignment3(int a)
	{
		this();
		System.out.println("One param Constructor");
	}

	public Assignment3(int c, int b)
	{
		this(15);
		System.out.println("Two para constructor");

	}
	
	public Assignment3(int a, int b, int c)
	{
		System.out.println("Three para constructor");
	}
	
	public Assignment3(int a, int b, int c, double d)
	{
		this(35,45);	
		System.out.println("Four para constructor");
	}
	
	public static void main(String[] args) {
		Assignment3 obj = new Assignment3(5,10,15,20);
	}
	
}
