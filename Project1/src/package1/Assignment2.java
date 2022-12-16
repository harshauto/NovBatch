package package1;


//((((10*2)-2)+2)-2)/2)
public class Assignment2 {

	public int multi(int a, int b) {
		int sum = a * b;
		System.out.println("Sum of two numbers " + sum);
		return sum;
	}
	
	public int sub (int c, int d)
	{
		int sub = c - d;
		System.out.println("Sub of two number " + sub);
		return sub;
	}
	
	public int add(int e, int f)
	{
		int mul = e + f;
		System.out.println("Multiplication of two numbers " + mul);
		return mul;
	}
	
	
	public int div(int x, int y)
	{
		int div = x/y;
		System.out.println("Div of two numbers "+ div);
		return div;
	}
	
	public static void main(String[] args) {
		Assignment2 obj = new Assignment2();
		int mulresult = obj.multi(10, 2);
		int subresult = obj.sub(mulresult, 2);
		int addresult = obj.add(subresult, 2);
		int newsubresult = obj.sub(addresult, 2);
		int Finalresult = obj.div(newsubresult, 2);
		System.out.println("Final Result "  +  Finalresult);
	}
	
}
