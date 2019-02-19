import java.util.Scanner;
class Greater3 
{

	public static void main(String[] args)
	{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		System.out.println("enter the third number");
		int c = sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		
		else if(b>c)
		{
			System.out.println("B is greater");
		}
		
		else{
			System.out.println("C is greater");
		}
	
	}

}