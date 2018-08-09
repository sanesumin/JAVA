package ex.day0621;

public class if1Ex {

	public static void main(String[] args) {
		int i = 1;
		
		while(i<=20) {
			i++;
			if(i%2 == 0) {
				System.out.println(i);
				continue;
			}
		}
		System.out.println("프로그램 종료");
	}

}
