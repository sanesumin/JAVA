package promotion.ex.today;

 class A {}

 class B extends A{}
 class C extends A{}
 class D extends B{}
 class E extends C{}
 
 public class PromotionEx{
	 B b = new B();
	 C c = new C();
	 D d = new D();
	 E e = new E();//각각의 디폴트 생성자 호출
	 
	 A a1 = b;
	 A a2 = c;
	 A a3 = d;
	 A a4 = e;//가장 조상인 A클래스 캐스팅 가능
	 
	 B b1 = d;
	 C c1 = e;//바로 윗조상으로 캐스팅 가능
	 
	 //B b3 = e;
	 //C c2 = d;//상속관계가 없는 서로 다른 클래스로 취급되어 캐스팅이 불가능
 }

