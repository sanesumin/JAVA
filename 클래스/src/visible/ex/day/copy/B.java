package visible.ex.day.copy;

public class B {
		public B() { 
			A a = new A();
			a.field1 = 1; //public필드
			a.field2 = 1; //default필드
			//a.field3 = 1; // 패키지가 같은 경우라도
								//private필드는 접근이 제한된다.
			
			a.method1();  //public메소드
			a.method2();
			//a.method3();
		}
}
