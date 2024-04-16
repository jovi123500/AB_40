package abstractsss;
 abstract class GrandParentClass
{
	 abstract void modulus();  //AM1
	 abstract void displayy();  //AM2
	 static void show()
	 {
		 System.out.println("show");  //CM1
	 }
	
}

 abstract class ParentClass extends GrandParentClass
{
	abstract void  multiple();    //AM1
	abstract void div();          //AM2
	static void prin()
	{
		System.out.println("jovita");   //CM1
	}
}





public class Abstactsc extends ParentClass
{
	static void add()     //CM1
	{
		int a=20;
		int b=10;
		System.out.println(a+b);
	}
	static void sub()    //CM2
	{
		int a=20;
		int b=10;
		System.out.println(a-b);
	}



	public static void main(String[] args)
	{
		
		add();
		sub();
		prin();
		show();
		Abstactsc a1=new Abstactsc();
		a1.multiple();
		a1.div();
		a1.modulus();
		a1.displayy();
		

	}
	
	void multiple() 
	{
		int a=20;
		int b=10;
		System.out.println(a*b);
		
	}
	
	void div() 
	{
		int a=20;
		int b=10;
		System.out.println(a/b);
		
	}
	
	void modulus() 
	{

		int a=20;
		int b=10;
		System.out.println(a%b);
		
	}
	
	void displayy() 
	{
		
		System.out.println("display");
	}

}
