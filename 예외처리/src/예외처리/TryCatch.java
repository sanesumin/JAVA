package ����ó��;

public class TryCatch {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		
	}finally {
		System.out.println("���ܰ� �߻��� ���� ���ܰ� ó���Ǿ����ϴ�.");
		System.out.println("�����մϴ�.");
		}
	}
}
