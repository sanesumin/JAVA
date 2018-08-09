package ex.day0621;

public class ifEx {

	public static void main(String[] args) {
		for(int i=1; i<=20 ; i++) {
			if(i%2==0) {
				System.out.println(i);
				continue;
			}
		}
		System.out.println("프로그램 종료");

	}

}
