package 연습문제;

public class Anonymous {
	Vehicle field = new Vehicle() {//필드

		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
			
		}
		
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {//로컬변수

			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
				
			}
			
		};
		
	localVar.run();
	}
	
	void method2(Vehicle v) {//매개변수
		v.run();
	}
}
