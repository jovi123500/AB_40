package mypackage;

public class AssignConstr
{

	AssignConstr(int a)
	{
		System.out.println("1");
	}
	AssignConstr(char b)
	{
		System.out.println("2");
	}
	AssignConstr(String c)
	{
		System.out.println("3");
	}
	AssignConstr(boolean d)
	{
		System.out.println("4");
	}
	AssignConstr(int a, boolean b, String c)
	{
		System.out.println("5");
	}
	public static void main(String[] args) 
	{
		new AssignConstr(10);
		new AssignConstr('z');
		new AssignConstr("jovita");
		new AssignConstr(true);
		new AssignConstr(10,true,"jovita");

	}

}
