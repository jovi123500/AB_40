package mypackage;

public class Example5 
{

	public static void add()
	{
		int a1=10;
		int a2=20;
		int sum=a1+a2;
		System.out.println(sum);

	}	
	
	void multi()
	{
		int a1=10;
		int a2=20;
		int m=a1*a2;
		System.out.println(m);
	}
	
	Example5()
	{
		
		System.out.println("This is my constructor");
		
	}
	public static void main(String[] args)
	{

     add(); //static
     Example5 e=new Example5();//constructor
     e.multi(); //non static
	}

}
