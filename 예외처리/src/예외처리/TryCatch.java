package 예외처리;

public class TryCatch {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("클래스가 존재하지 않습니다.");
		
	}finally {
		System.out.println("예외가 발생한 경우는 예외가 처리되었습니다.");
		System.out.println("종료합니다.");
		}
	}
}
