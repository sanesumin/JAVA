package visible.ex.day.copy;

public class A {
	//필드
	public int field1; //필드의 public접근제한
	int field2; //필드의 default접근제한
	private int field3; //필드의 private접근제한
	
	//생성자
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	//메소드
	public void method1() {} //메소드의 public접근제한
	void method2() {} //메소드의default 접근제한
	private void method3() {} //메소드의 private접근제한
	
}
