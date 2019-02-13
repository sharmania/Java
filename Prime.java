
class Prime
{
	public static void main(String [] args)
	{
		int num;
		for(num=1;num<=1000;num++)
		{
			int flag=0;
			for(int i=2;i<=num-1;i++)
			{
				if(num%i==0)
				{
					flag=flag+1;
				}
			}

			if(flag==0)
			{
				System.out.println(num+"is a prime number");
			}	
		
			else
			{
				flag=0;
				
			}
		}

	}


}