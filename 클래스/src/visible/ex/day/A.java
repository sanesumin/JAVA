package visible.ex.day;

public class A { //default접근제한
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public A(boolean b) {}
	A(int b){} //default
	private A(String b) {}

}
