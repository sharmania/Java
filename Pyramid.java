class Pyramid
	{
		public static void main(String[] args)
		{
			for(int i=0;i<5;i++)
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
			}
		}

	}