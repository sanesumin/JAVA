package finalmethodex.inherit.today;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	public static void main(String[] args) {
		Car car = new SportsCar();
		car.speedUp();
		car.speedUp();
		car.speedUp();
		System.out.println(car.getSpeed());
		car.stop();
	}
}
