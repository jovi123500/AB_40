package scanner;

import java.util.Scanner;

public class Assign7 
{
	void add()
	{
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=a1.nextInt();
		System.out.println("Enter the value of b");
		int b=a1.nextInt();
		int c=a+b;
		System.out.println("The addition of a nd b is->" +c);
		
	}
	void sub()
	{
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=a1.nextInt();
		System.out.println("Enter the value of b");
		int b=a1.nextInt();
		int c=a-b;
		System.out.println("The subtraction of a nd b is->" +c);
		
	}
	void mul()
	{
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=a1.nextInt();
		System.out.println("Enter the value of b");
		int b=a1.nextInt();
		int c=a*b;
		System.out.println("The multiplication of a nd b is->" +c);
		
	}
	void div()
	{
		Scanner a1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=a1.nextInt();
		System.out.println("Enter the value of b");
		int b=a1.nextInt();
		int c=a/b;
		System.out.println("The division of a nd b is->" +c);
		
	}
	public static void main(String[] args) 
	{
		Assign7 p=new Assign7();
		p.add(); 
		p.sub();
		p.mul(); 
		p.div();
	}

}
