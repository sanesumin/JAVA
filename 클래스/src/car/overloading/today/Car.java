package car.overloading.today;

public class Car {
	String company="�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	
	Car(String model){
		//this.model = model;
		this(model,"����",250);
	}
	
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model,color,300);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
