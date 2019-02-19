import java.util.Scanner;

public class Add1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter the second number");
		int b =sc.nextInt();
		
		System.out.println(name+ " "  + "your answer is " + (a+b));
	
	}


}