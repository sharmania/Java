class Complex
{
	double real;
	double imaginery;
	
	public Complex(double r , double i)
	{
	
		this.r = r;
		this.i=i;
	}
	
	void add(Complex obj2)
	{
		this.r += obj2.r;
		this.i+=obj2.i;
	}
	
	void display()
	{
		System.out.println(this.r + " + i" + this.i);
	
	}




	public static void main(String[] args)
	{
		
		Complex obj1 = new Complex(10.3,67.4);
		Complex obj2 = new Complex(0.7,7.4);
	
	}

}
