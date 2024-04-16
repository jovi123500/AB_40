package string;

public class String_ex 
{

	public static void main(String[] args)
	{

		String input= "I am Student";
		boolean b= input.contains("am");
		String s1= input.substring(5);
		String s2=input.substring(2,4);
		System.out.println(b);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(input.concat(" Mekha"));
	}

}
