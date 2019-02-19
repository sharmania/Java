import java.util.Scanner;

class Student
{
	private String name;
	private int roll_no;
	private String branch;
	private int arr[] = new int[5];
	
	private float per=0;
	
	Student()
	{
		
		System.out.println("Default constructor");
	}
	public void input()
	{
		Scanner s = new Scanner (System.in);
		System.out.println("Enter your name: ");
		name = s.next();
		System.out.println("Enter your roll no: ");
		roll_no=s.nextInt();
		System.out.println("Enter your branch: ");
		branch=s.next();
		System.out.println("Enter your marks: ");
		for(int i=0;i<5;i++)
		{
			
			arr[i]=s.nextInt();
		}
	}
	
	public void percentage()
	{
		int sum=0;
		
		for(int i=0;i<5;i++)
		{
			sum=sum+arr[i];
		}
		
		per=(float)(sum*100)/500;
		
		
		
	}
	
	
	public void print()
	{
		System.out.println("Name is: " + name);
		System.out.println("Roll no is: " + roll_no);
		System.out.println("Branch is: " + branch);
		System.out.println("Percentage is: " + per + "%");
		
		if(per>50 && per<70)
			System.out.println("Distinction II");
		else if(per>70)
			System.out.println("Distinction I");
		else
			System.out.println("fail");
		
	
	}

}

class StudentInfo
{
	public static void main(String[] args)
	{
		
		Student objStu  =  new Student();
		Student objStu1 = new Student();
		//objStu.input();
		
		//objStu.percentage();
		//objStu.print();
		
	
	}

}