package ex9.today;

public class CheckOverflowEx {
	
	public static void main(String[] args) {
		int result = 0;
		try {
			result = safeadd(200000000,2000000000);
		}catch(ArithmeticException e) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����Ҽ� ����");
		}catch(Exception el) {
			System.out.println("�� �ܿ� ������ �߻��Ͽ� ��ġ�� ���ؾ� �մϴ�.");
		}
		System.out.println("result="+result);

	}
	public static int safeadd(int left, int right) {
		if(right>0) {
			if(left >(Integer.MAX_VALUE-right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}else {
			if((left+right) < Integer.MIN_VALUE) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		return left+right;
	}
}
