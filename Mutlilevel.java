package inheritance;

class GrandparentClass
{
	static void meth1()
	{
		System.out.println("1");
	}
	
}
class ParentClass3 extends GrandparentClass
{
	static void meth2()
	{
		System.out.println("2");
	}
}
class ParentClass2 extends ParentClass3
{
	static void meth3()
	{
		System.out.println("3");
	}
}

class ParentClass1 extends ParentClass2
{
	static void meth4()
	{
		System.out.println("4");
	}
}


public class Mutlilevel extends ParentClass1
{
	static void meth5()
	{
		System.out.println("5");
	}
	public static void main(String[] args) 
	{

		meth1();
		meth2();
		meth3();
		meth4();
		meth5();
		

	}

}
