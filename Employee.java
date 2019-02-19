class Employee 							//Employee class 
{
	protected String name;
	protected int empid;
	protected int contact_no;
	protected String adress;
	
	public Employee(String name,int empid,int contact_no,String address) //Employee class constructor
	{
	this.name=name;
	this.empid=empid;
	this.contact_no=contact_no;
	this.address=address;
	
	}
	
	void display()
	{
		System.out.println("The name is : " + name);
		System.out.println(" empid is" + empid);
		System.out.println("contact number  is : " + contact_no);
		System.out.println("address is : " + address);
	}

}

class Manager extends Employee{
	
		protected String post;
		protected int salary;

		public Manager(String post , int salary)
		{
			super(name,empid,contact_no,address);
			this.post=post;
			this.salary=salary;
			
		}
		
		void display()
		{
			
			super.display();
			System.out.println("Post is : " + post);
			System.out.println(" salary is : " + salary);
		}
	
}

class Developer extends Employee{
	
		protected String skill;
		protected String experience;
		protected String designation;
		
		public Developer(String skill , String experience , String designation)
		{
			super(name,empid,contact_no,address);
			this.skill=skill;
			this.experience=experience;
			this.designation=designation;
			
		}
		
		
		void display()
		{
			
			super.display();
			System.out.println(" skill is : " + skill);
			System.out.println(" experience is : " + experience);
			System.out.println(" designation is : " + designation);
		}
	
}


class A{
	
	piblic static void main(String[] agrs)
	{
		Employee a = new Employee('niharika',123,345566,'rgytyj');
		Employee a = new Manager('nikita',123,345566,'rgytyj');

		Employee a = new Developer('neeti',123,345566,'rgytyj');
		Manager a = new Manager('ameena',123,345566,'rgytyj');
		Developer a = new Developer('niharika',123,345566,'rgytyj');
	}
	
}
