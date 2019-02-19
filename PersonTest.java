import java.util.Scanner;

class Student
{
	private String name;
	private int roll_no;
	private String branch;
	public int arr[] = new int[5];
	
	private int sum=0;
	
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
		
		for(int i=0;i<5;i++)
		{
			sum=sum+arr[i];
		}
		
	}
	
	
	public void print()
	{
		System.out.println("Name is: " + name);
		System.out.println("Roll no is: " + roll_no);
		System.out.println("Branch is: " + branch);
		System.out.println("Percentage is: " + sum);
	
	}

}

class StudentInfo
{
	public static void main(String[] args)
	{
		
		Student objStu = new Student();
		//Person objPerson1 = new Person();
		objStu.input();
		
		objStu.percentage();
		objStu.print();
		//objPerson1.input();
		//objPerson1.print();
		//objPerson1.eligible();
	
	}

}