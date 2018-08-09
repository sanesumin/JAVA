package ex9.today;

public class CheckOverflowEx {
	
	public static void main(String[] args) {
		int result = 0;
		try {
			result = safeadd(200000000,2000000000);
		}catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할수 없음");
		}catch(Exception el) {
			System.out.println("그 외에 에러가 발생하여 조치를 취해야 합니다.");
		}
		System.out.println("result="+result);

	}
	public static int safeadd(int left, int right) {
		if(right>0) {
			if(left >(Integer.MAX_VALUE-right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}else {
			if((left+right) < Integer.MIN_VALUE) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left+right;
	}
}
