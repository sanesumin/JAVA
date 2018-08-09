package finalmethodex.inherit.today;

public class Car {
	
	//
	public int speed;
	
	//
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	//
	public void speedUp() {speed += 1;}
	
	public final void stop() {
		System.out.println("Â÷¸¦ ¸ØÃã");
		speed = 0;
	}
}
