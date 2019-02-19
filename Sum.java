import java.util.Scanner;
class Sum
{
	public static void main(String [] args)
	{
	
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i =0;i<6;i++)
		{
			System.out.println("Enter " + i + "number :"); 
			int n = sc.nextInt();
			if(n>0)
			{
			/*System.out.println("wrong number");
			break;*/
			sum=sum+n;
			}
			else 
			{
				continue;
				
			}
		}
		
			System.out.println(sum);
			
		
	}


}