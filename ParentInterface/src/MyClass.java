
public class MyClass {
	public static void main(String[] args) {
		ChildInterface1 ci1 = new ChildInterface1() {
			
			@Override
			public void method1() {
				System.out.println("child-method1");
			}
			
			@Override
			public void method3() {
				System.out.println("child-method3");
			}
		};
		
		ci1.method1();
		ci1.method2();
		ci1.method3();
	}
}
