
public class A {
	int field11;
	void method11() {}
	static int field22;
	static void method22() {}
	A( ) {System.out.println("A按眉啊 积己凳");}
	
	class B{
		B(){System.out.println("B按眉啊 积己凳");
		int field1;
		}
	}
		void method() {
			field11 = 10;
			method11();
			
			field22 = 10;
			method22();
		}
}
		
	int field1;
	//static int field2;
	void method1() {}
	//static void method2{}
}
	
	static class C	{
		C(){System.out.println("C 按眉啊 积己凳");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	void method() {
		field11 = 10;
		method11();
		
		field22 = 10;
		method22();
	
	void method() {
		class D{
			D(){System.out.println("D按眉啊 积己凳");}
			int field1;
			//static int field2;
			void method1()	{}
			//static void method2() {}
	}
		
	D d = new D();
	d.field1 = 3;
	d.method1();
	
	}
	
	B field1 = new B();
	C field2 = new C();
	
	void  method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	static B field3 = new B();
	static C field4 = new C();
}
