import java.util.Scanner;

class Arithmetic
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		
		char o ;
		System.out.println("enter the operation : ");
		o = sc.next().charAt(0);
		
		switch(o)
		{
			case '+' :
			
				System.out.println("the sum is " + (a+b));
				break;
			case '*' :
				System.out.println("multiplication is " + (a*b));
				break;
		
			case '/' :
				System.out.println("division is " + (a/b));
				break;
				
			case '-' :
				System.out.println("subtraction is" + (a-b));
				break;
				
			default :
				System.out.println("wrong operator");
		}
		
	}

}