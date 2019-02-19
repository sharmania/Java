
interface truck {


	public void display();

	public int getAxles();

	public double getWeight();

	public String getName();
}


 class FordTruck implements truck
{
	String name = "FordTruck";
	int axles ;
	double weight;
	public FordTruck( int axles ,double weight)
	{
		//this.name =name;
		this.axles=axles;
		this.weight=weight;
	}
	
	public FordTruck() {
		// TODO Auto-generated constructor stub
	}

	public int getAxles() {
		return axles;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void display()
	{
		System.out.println("Truck name : " + name + "axles : " + axles +"weight : "+ weight);
	}
}


 class Nissan implements truck
{
	String name="Nissan Truck";
	int axles;
	double weight;
	public Nissan(int axles ,double weight)
	{
		//this.name =name;
		this.axles=axles;
		this.weight=weight;
	}
	
	public int getAxles() {
		return axles;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void display()
	{
		System.out.println("Truck name : " + name + "axles : " + axles +"weight : "+ weight);
	}
}
 
 
 class Daewoo implements truck
{
	String name="Daewoo Truck";
	int axles;
	double weight;
	public Daewoo( int axles ,double weight)
	{
		//this.name =name;
		this.axles=axles;
		this.weight=weight;

	}
	
	public int getAxles() {
		return axles;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void display()
	{
		System.out.println("Truck name : " + name + "axles : " + axles +"weight : "+ weight);
	}
}
 
 
 
 
