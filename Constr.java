package mypackage;

public class Constr
{

	Constr(int a,int b)
	{
		System.out.println("1");
	}
	
	Constr(double a)
	{
		System.out.println("2");
	}
	Constr()
	{
		System.out.println("3");
	}
	
	public static void main(String[] args)
	{
		
		new Constr();
		new Constr(65.65);
		new Constr(10,30);

	}

}
