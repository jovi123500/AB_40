package mypackage;

public class MyAssisn
{

	static void add()
	{
		
			int a1=10;
			int a2=20;
			int sum=a1+a2;
			System.out.println(sum);

	}
	static void sub()
	{
		int a1=10;
		int a2=20;
		int s=a2-a1;
		System.out.println(s);

	}
	static void mul()
	{
		int a1=10;
		int a2=20;
		int m=a1*a2;
		System.out.println(m);

	}
	static void div()
	{
		int a1=10;
		int a2=20;
		int d=a2/a1;
		System.out.println(d);

	}
	static void modu()
	{
		int a1=10;
		int a2=25;
		int d=a2%a1;
		System.out.println(d);

	}
	
	
	 void addit()
	{
		
			int a1=50;
			int a2=30;
			int sum=a1+a2;
			System.out.println(sum);

	}
	void subtr()
	{
		int a1=50;
		int a2=30;
		int s=a2-a1;
		System.out.println(s);

	}
	void multi()
	{
		int a1=50;
		int a2=30;
		int m=a1*a2;
		System.out.println(m);

	}
	 void divi()
	{
		int a1=50;
		int a2=30;
		int d=a1/a2;
		System.out.println(d);

	}
	 void modul()
	{
		int a1=50;
		int a2=25;
		int d=a1%a2;
		System.out.println(d);

	}
	

	
	public static void main(String[] args )
	{
		add();
		sub();
		mul();
		div();
		modu();
		
		MyAssisn m1=new MyAssisn();
		m1.addit();
		m1.subtr();
		m1.multi();
		m1.divi();
		m1.modul();
		

	}

}
