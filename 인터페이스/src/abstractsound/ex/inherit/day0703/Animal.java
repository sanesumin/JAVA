package abstractsound.ex.inherit.day0703;

public abstract class Animal {//추상클래스
	//필드
	public String Kind;
	//생성자
	//메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();//추상메소드
}
