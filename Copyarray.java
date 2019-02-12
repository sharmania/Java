import java.util.Scanner;
class Copyarray 
	{

		public static void main(String[] args)
			{	
				Scanner sc=new Scanner(System.in);
				int arr1[]= new int[6];
				int arr2[]=new int[6];
				for(int i=0;i<6;i++)
					{
						arr1[i]=sc.nextInt();
		
					}

				for(int j=0;j<6;j++)
					{	
						arr2[j]=arr1[j];
					}
				for(int o =0;o<6;o++)
					{
						System.out.println(arr2[o]);
					}
			}
	}