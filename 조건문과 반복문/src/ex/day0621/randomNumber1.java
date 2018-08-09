package ex.day0621;

public class randomNumber1 {

	public static void main(String[] args) {
		int num;
		
		do {
			num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) break;
		}while(true);
		
			System.out.println("프로그램 종료");
		

	}

}
