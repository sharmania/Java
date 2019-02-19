public class InstanceofExample
{
	public static void main(String[] args)
	{
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		MotorCycle moto = new MotorCycle();
		
		System.out.println("vehicle instanceof Vehicle: "+ (vehicle instanceof Vehicle));
		System.out.println("car instanceof Vehicle: "+ (car instanceof Vehicle));
		System.out.println("car instanceof Car: "+ (car instanceof Car));
		System.out.println("car instanceof DriverCar: "+ (car instanceof DriverCar));
		System.out.println("moto instanceof Vehicle: "+ (moto instanceof Vehicle));
		System.out.println("moto instanceof MotorCycle: "+ (moto instanceof MotorCycle));
		
		
		//those will evaluate to false
		
		System.out.println("vehicle instanceof Car: "+ (vehicle instanceof Car));
		
		System.out.println("vehicle instanceof DriverCar: "+ (vehicle instanceof DriverCar));
		System.out.println("moto instanceof DriverCar: "+ (moto instanceof DriverCar));
		
		
		//those will evaluate to false , as the object car is null
		car=null;
		
		System.out.println("(car=null) instanceof Vehicle:" + (car instanceof Vehicle));
		System.out.println("(car=null) instanceof Car:" + (car instanceof Car));
		
	
	}


}

class Vehicle
{
	
}


class Car extends Vehicle implements DriverCar
{
	
	
}

class MotorCycle extends Vehicle
{
	
}

interface DriverCar
{
	
}


