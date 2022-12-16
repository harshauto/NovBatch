package package1;

public class Student {

	int rollno;
	int age;

	public void display1() {

		System.out.println("Wellcome to all of you");

	}

	public void display2() {

		System.out.println("Automation is very easy");

	}

	public static void main(String[] args) {
		Student obj = new Student();
		System.out.println(obj.age = 10);
		System.out.println(obj.rollno = 20);
		obj.display1();
		obj.display2();
	}

}
