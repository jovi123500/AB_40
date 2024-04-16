package scanner;

import java.util.Scanner;

public class Scanner_ex 
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		 double pi=3.14;
		 System.out.println("Enter the value of radius");
		 int r=s1.nextInt();
		 double circ=2*pi*r;
		 System.out.println("The circumference of circle is->"+circ);
		 

	}

}
