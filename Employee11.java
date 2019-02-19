abstract class Person11 {
	
	private String name;
	private String gender;
	
	 Person11(String nm, String gen){
		this.name=nm;
		this.gender=gen;
	}
	
	//abstract method
	public abstract void work();
	
	
	public String toString(){
		return "Name="+this.name+"::Gender="+this.gender;
	}

	public void changeName(String newName) {
		this.name = newName;
	}	
}

 class Employee11 extends Person11 {
	
	private int empId;
	
	public Employee11(String nm, String gen, int id) {
		super(nm, gen);
		this.empId=id;
	}

	
	public void work() {
		if(empId == 0){
			System.out.println("Not working");
		}else{
			System.out.println("Working as employee!!");
		}
	}
	
	public static void main(String args[]){
		//coding in terms of abstract classes
		Person11 student = new Employee11("Dove","Female",0);
		Person11 employee = new Employee11("Pankaj","Male",123);
		student.work();
		employee.work();
		//using method implemented in abstract class - inheritance
		employee.changeName("Pankaj Kumar");
		System.out.println(employee.toString());
	}

}