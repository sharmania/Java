
public class TestToll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tollBooth tb = new AlleghenyTollBooth();

		truck ford = new FordTruck(5,12000); // 5 axles and 12000 kilograms
		truck nissan = new Nissan(2,5000); // 2 axles and 5000kg
		truck daewoo = new Daewoo(6,17000); 
		

		tb.calculate(ford);
		tb.displayData();
		tb.calculate(nissan);
		tb.displayData();
		tb.calculate(daewoo);
		tb.displayData();
		

	}

}
