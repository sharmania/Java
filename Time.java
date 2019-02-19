class Time
{
	int hour;
	int minute;
	int second;
	
	public Time(int h ,int m , int s)
	{
	
		this.hour=h;
		this.minute=m;
		this.second=s;

	}
	
	void add( Time obj2)
	
	{
		this.hour+=obj2.hour;
		this.minute+=obj2.minute;
		this.second+=obj2.second;
	
	}
	
	void display()
	
	{
		if(this.second>=60 )
			
			{
				this.minute++;
				this.second=this.second-60;
				
			}
			
			 if(this.minute>=60)
				
				{
					
					this.hour++;
					this.minute=this.minute-60;
				}
			
			
		
		System.out.println(this.hour + " : " + this.minute + " : " + this.second);
	}
	
	
	
	public static void main(String[] args)
	
	{
		Time obj1 = new Time(3,54,63);
		Time obj2 = new Time(9,45,12);
		obj1.add(obj2);
		obj1.display();
	}
}