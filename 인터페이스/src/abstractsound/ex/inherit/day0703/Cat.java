package abstractsound.ex.inherit.day0703;

public class Cat extends Animal {
	//필드
	//생성자
	public Cat() {
		this.Kind = "포유류";
	}
	@Override
	public void sound() {
		System.out.println("야옹");
		
	}


}
