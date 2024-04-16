package scanner;

import java.util.Scanner;

public class Scanner_global 
{
	final static double pi=3.14;
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
		Scanner s1=new Scanner(System.in);
		 
		 System.out.println("Enter the value of radius");
		 double r=s1.nextDouble();
		 double area=pi*r*r;
		 System.out.println("The area of circle is->"+area);
		}
	}

}
