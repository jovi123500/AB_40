package mypackage;

public class Or_operator 
{

	public static void main(String[] args) 
	{
	
		int age=20;
		int salary=70000;
		if(age>10)
		{
			System.out.println("1");
		}
		if(!(age>10 && salary>8000))
		{
			System.out.println("2");
		}

	}

}
