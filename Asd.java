import java.util.Scanner;
class Asd
{
	public static void main(String [] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size= sc.nextInt();
		int arr[] = new int[size];
		int sum=0;
		for(int i=0;i<size;i++)
		{ 
		System.out.println("Enter " + i + " number : ");
		arr[i] = sc.nextInt();
		sum=sum+arr[i];
		
		}
		
		for(int i=0;i<size;i++)
		{
			
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("sum is : " + sum);
	
	}


}