package car.overloading.day0627;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("����ӵ�:"+speed+"km/h");

	}

}
