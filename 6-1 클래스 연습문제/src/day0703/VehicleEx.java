package day0703;

public class VehicleEx {
	public static void main(String[] args) {
		Vehicle vehicle = new Taxi();
		
		vehicle.run();
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}
}
