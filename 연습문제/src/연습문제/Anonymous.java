package ��������;

public class Anonymous {
	Vehicle field = new Vehicle() {//�ʵ�

		@Override
		public void run() {
			System.out.println("�����Ű� �޸��ϴ�.");
			
		}
		
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {//���ú���

			@Override
			public void run() {
				System.out.println("�¿����� �޸��ϴ�.");
				
			}
			
		};
		
	localVar.run();
	}
	
	void method2(Vehicle v) {//�Ű�����
		v.run();
	}
}
