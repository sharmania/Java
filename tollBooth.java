
interface tollBooth {

	public void calculate(truck obj);
	public void displayData(); 
	
}

class AlleghenyTollBooth implements tollBooth
{
	static int count =0;
	double toll;
	String name;
	int axles;
	double weight;
	double sum=0;
	//FordTruck ft= new FordTruck();
	
	@Override
	public void calculate(truck obj) {
		// TODO Auto-generated method stub
		name = obj.getName();
		axles=obj.getAxles();
		weight=obj.getWeight();
		this.toll = 5*obj.getAxles()+10*((obj.getWeight()/1000))/2;
		count++;
		sum =(double) sum + toll;
	}
@Override
	public void displayData() {
		// TODO Auto-generated method stub
		System.out.println("Truck is entering : " +this.name + " " + " " + count + " " + " has following specifications : ");
		System.out.println( " no. of Axles : " + this.axles );
		System.out.println( " weight is : "+ this.weight );
		System.out.println("Generated Toll is : " + this.toll);
		System.out.println("Generated Receipt is : " + this.sum);
		System.out.println("-----------------------------------------");
	}
}


 