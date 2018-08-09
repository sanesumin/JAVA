package visible.ex.today.copy;

import visible.ex.day.copy.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1; //public필드
		//a.field2 = 1; //default필드 --->다른 패키지에서는 안됨
		//a.field3 = 1; // private필드 ---> 다른 패키지 뿐 아니라
							//자신의 패키지의다른 클래스에서도 에러
		
		a.method1();  //public메소드
		//a.method2(); //default메소드
		//a.method3(); //private메소드
	}
}
