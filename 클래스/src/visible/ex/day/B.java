package visible.ex.day;

public class B { //public 접근제한
	A a;
	
	A a1 = new A(true);
	A a2 = new A(1);
	//A a3 = new A("문자열");  //private생성자의 경우 
										//외부클래스에서 접근하려하니까 에러가남
}
