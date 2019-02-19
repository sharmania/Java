import java.util.Scanner;

class Oddeven
{
	
	public static void main(String[] args)
	{
		/*Scanner sc =new Scanner(System.in);
		System.out.println("enter the numbaer");
		int q = sc.nextInt();*/
		/*if(q%2==0)
		{
			System.out.println("The n umber is even");
		}
		
		else
		{
			System.out.println("The number is odd");
		}*/
		System.out.println("ODD \t EVEN");
		//System.out.println("1 \t 2");
		for(int i=0;i<=10;i++)
			
			{
				if(i%2!=0)
				{
					
					System.out.print( i );
				}
				
				else if (i%2==0 && i!=0){
					 //System.out.println("\t ODDS");
					 System.out.println( "\t" + i);
					
				}
			}
	
	}

}