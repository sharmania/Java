public class ShapeTest 
{
	public static void main(String[] args)
	{
	
		Shape shape = new Circle(10);
		
		shape.draw();
		
		System.out.println("Area = " + shape.getArea());
		
		shape = new Rectangle(10,10);
		shape.draw();
		System.out.println("Area = " + shape.getArea());
	}

}