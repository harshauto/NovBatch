package package1;



//(((((10+2)+2)-2)*2)/2)
public class Assignment1 {
	
	public int add(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of two numbers " + sum);
		return sum;
	}
	
	public int sub (int c, int d)
	{
		int sub = c - d;
		System.out.println("Sub of two number " + sub);
		return sub;
	}
	
	public int multi(int e, int f)
	{
		int mul = e * f;
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
		Assignment1 obj = new Assignment1();
		int sumresult = obj.add(10, 2);
		int newaddresult = obj.add(sumresult, 2);
		int subresult = obj.sub(newaddresult, 2);
		int mulresult = obj.multi(subresult, 2);
		int Finalresult = obj.div(mulresult, 2);
		System.out.println("Final Result "  +  Finalresult);
	}

}
