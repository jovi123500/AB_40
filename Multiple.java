package inheritance;

class Parentclass1
{
	static void meth1()
	{
		System.out.println("1");
	}
}

class Parentclass2
{
	static void meth2()
	{
		System.out.println("2");
	}
}


public class Multiple extends Parentclass1,Parentclass2
{
	static void meth3()
	{
		System.out.println("2");
	}
	public static void main(String[] args)
	{



	}

}
