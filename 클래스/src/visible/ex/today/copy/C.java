package visible.ex.today.copy;

import visible.ex.day.copy.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1; //public�ʵ�
		//a.field2 = 1; //default�ʵ� --->�ٸ� ��Ű�������� �ȵ�
		//a.field3 = 1; // private�ʵ� ---> �ٸ� ��Ű�� �� �ƴ϶�
							//�ڽ��� ��Ű���Ǵٸ� Ŭ���������� ����
		
		a.method1();  //public�޼ҵ�
		//a.method2(); //default�޼ҵ�
		//a.method3(); //private�޼ҵ�
	}
}
