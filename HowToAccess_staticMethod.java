package mypackage;

public class HowToAccess_staticMethod
{

	static void add()
	{
		System.out.println("Addition");
	}
	static void subtract()
	{
		System.out.println("Subtraction");
	}
	static void multiplication()
	{
		System.out.println("Multiplication");
	}
	static void division()
	{
		System.out.println("Division");
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("Main method");
		add();
		subtract();
		multiplication();
		division();
	}

}
