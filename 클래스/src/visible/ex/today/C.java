package visible.ex.today;

import visible.ex.day.A;
//import visible.ex.day.A;
import visible.ex.day.B;

public class C {
	//A a ; //default접근제한이라서 다른패키지에 접근x
	B b; //public 접근 제한이라 가능
			// 여기에서 B클래스를 이용해서 필드 선언 및 생성자/
			//메소드 내부에서 변수 선언 가능
	
	A a1 = new A(true);
	//A a2 = new A(1);	//A의 default생성자의 경우 같은 패키지에서만 사용가능
								//다른 패키지의 클래스인 C에서 생성하려고 하면 에러발생
	//A a3 = new A("문자열"); //private생성자는 어떤 경우든지 본인의
										//클래스 내부에서만 자유롭게 사용하고
										//패키지나 클래스가 다르면 에러가 발생.
}
