import java.util.Scanner;
class Duplicate

	{

		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			int arr[]= new int[6];
			for(int i=0;i<5;i++)
				{
					arr[i]=sc.nextInt();
				}		
			for(int j=0;j<5;j++)
				{
					for(int k = j+1;k<5;k++)
					{
						if(arr[j]==arr[k])
						{
							System.out.println(arr[j]+" is duplicate in this array");
						}
					}
				}	
		}		
	}