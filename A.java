class Employee 							//Employee class 
{
	protected String name;
	protected int empid;
	protected int contact_no;
	protected String address;
	
	public Employee(String name,int empid,int contact_no,String address) //Employee class constructor
	{
	this.name=name;
	this.empid=empid;
	this.contact_no=contact_no;
	this.address=address;
	
	}
	
	void display()
	{
		System.out.println("The name is : " + this.name);
		System.out.println(" empid is" + this.empid);
		System.out.println("contact number  is : " + this.contact_no);
		System.out.println("address is : " + this.address);
	}

}

class Manager extends Employee{
	
		protected String post;
		protected int salary;

		public Manager(String name,int empid,int contact_no,String address,String post , int salary)
		{
			super(name,empid,contact_no,address);
			this.post=post;
			this.salary=salary;
			
		}
		
		void display()
		{
			
			super.display();
			System.out.println("Post is : " + this.post);
			System.out.println(" salary is : " + this.salary);
		}
	
}

class Developer extends Employee{
	
		protected String skill;
		protected int experience;
		protected String designation;
		
		public Developer(String name,int empid,int contact_no,String address,String skill , int experience , String designation)
		{
			super(name,empid,contact_no,address);
			this.skill=skill;
			this.experience=experience;
			this.designation=designation;
			
		}
		
		
		void display()
		{
			
			super.display();
			System.out.println(" skill is : " + this.skill);
			System.out.println(" experience is : " + this.experience);
			System.out.println(" designation is : " + this.designation);
		}
	
}


class A{
	
	public static void main(String[] agrs)
	{
		Employee a = new Employee("niharika",123,345566,"rgytyj");
		a.display();
		Employee b = new Manager("nikita",123,345566,"rgytyj","HR",50000);
		b.display();
		//Employee c = new Developer("abd",45,2345,"gdghrh","java",5,"TL");
		Manager d = new Manager("nikita",123,345566,"rgytyj","rgytyj",90000);
		d.display();
		Developer g = new Developer("nikita",123,345566,"rgytyj","laravel",12,"rgytyj");
		g.display();
		
		
	}
	
}
