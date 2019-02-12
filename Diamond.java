class Diamond
	{
		public static void main(String[] args)
		{
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<5-i;j++)
					{

					System.out.print(" ");
					}
				for(int K=0;K<=i;K++)
					{	
					System.out.print("* ");	
					}
				System.out.println();
			//}
			
			/*for(int i=5;i<10;i++)
			{*/
				for(int j=0;j<i;j++)
					{

					System.out.print(" ");
					}
				for(int K=i;K<5-i;K++)
					{	
					System.out.print("* ");	
					}
				System.out.println();
			}


		}








  int i,j,r;
   System.out.print("Input number of rows (half of the diamond) : ");
   Scanner in = new Scanner(System.in);
		    r = in.nextInt();
   for(i=0;i<=r;i++)
   {
     for(j=1;j<=r-i;j++)
     System.out.print(" ");
     for(j=1;j<=2*i-1;j++)
       System.out.print("*");
     System.out.print("\n");
   }
 
   for(i=r-1;i>=1;i--)
   {
     for(j=1;j<=r-i;j++)
     System.out.print(" ");
     for(j=1;j<=2*i-1;j++)
       System.out.print("*");
     System.out.print("\n");
   }
 
}





	}