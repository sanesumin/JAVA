package If.day0620;

public class SwitchEx {

	public static void main(String[] args) {
		int score = 80;
		System.out.println("점수:"+score);
		
		
		switch(score) {
		case 90: 
			System.out.println("A+입니다");
			break;
		case 80:
			System.out.println("A입니다");
			break;
		case 70:
			System.out.println("B입니다");
			break;
		}
		
	
	}

}
