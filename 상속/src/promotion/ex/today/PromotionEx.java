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
	 E e = new E();//������ ����Ʈ ������ ȣ��
	 
	 A a1 = b;
	 A a2 = c;
	 A a3 = d;
	 A a4 = e;//���� ������ AŬ���� ĳ���� ����
	 
	 B b1 = d;
	 C c1 = e;//�ٷ� ���������� ĳ���� ����
	 
	 //B b3 = e;
	 //C c2 = d;//��Ӱ��谡 ���� ���� �ٸ� Ŭ������ ��޵Ǿ� ĳ������ �Ұ���
 }

