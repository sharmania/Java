import java.util.Scanner;
class Dowhiledemo
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		String guess;
		
		do
		{
			System.out.print("Guess my name: ");
			guess=sc.nextLine();
		
		
		}
		
		while(!"Raj".equals(guess));
		System.out.println("Congratulations ! Ab bhag yaha se");
	
	}

}