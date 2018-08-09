
public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		
		a.method();
		
		class Thread1  extends Thread{
			public Thread1() {
				System.out.println("현재 쓰레드:"+
						Thread.currentThread().getName());
				
			}
		}
		Thread1 t1 = new Thread1();
		t1.start();
		
		
	}
}
