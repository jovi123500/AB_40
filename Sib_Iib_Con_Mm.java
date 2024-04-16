package mypackage;

public class Sib_Iib_Con_Mm 
{
	static
	{
		System.out.println("I am SIB");
	}
	{
		System.out.println("I am IIB");
	}
	Sib_Iib_Con_Mm()
	{
		System.out.println("I am Constructor");
	}
	public static void main(String[] args)
	{
		
		System.out.println("I am main method,i.e heart");
		Sib_Iib_Con_Mm s1=new Sib_Iib_Con_Mm();
		Sib_Iib_Con_Mm m1=new Sib_Iib_Con_Mm();

	}

}
