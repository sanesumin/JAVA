package visible.ex.day.copy;

public class A {
	//�ʵ�
	public int field1; //�ʵ��� public��������
	int field2; //�ʵ��� default��������
	private int field3; //�ʵ��� private��������
	
	//������
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	//�޼ҵ�
	public void method1() {} //�޼ҵ��� public��������
	void method2() {} //�޼ҵ���default ��������
	private void method3() {} //�޼ҵ��� private��������
	
}
