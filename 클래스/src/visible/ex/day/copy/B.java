package visible.ex.day.copy;

public class B {
		public B() { 
			A a = new A();
			a.field1 = 1; //public�ʵ�
			a.field2 = 1; //default�ʵ�
			//a.field3 = 1; // ��Ű���� ���� ����
								//private�ʵ�� ������ ���ѵȴ�.
			
			a.method1();  //public�޼ҵ�
			a.method2();
			//a.method3();
		}
}
