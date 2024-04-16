package mypackage;

public class How_to_call_nonstaticmethod
{
	void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	void subtract()
	{
		int a=10;
		int b=20;
		int sub=b-a;
		System.out.println(sub);
	}

	public static void main(String[] args) 
	{
		How_to_call_nonstaticmethod h1=new How_to_call_nonstaticmethod();
		h1.add();
		h1.subtract();
	}

}
