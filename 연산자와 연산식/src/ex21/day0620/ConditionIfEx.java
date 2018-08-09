package ex21.day0620;

public class ConditionIfEx {

	public static void main(String[] args) {
		int score = 90;
		
		
		 char grade = (score>90)? 'A': (score>80)? 'B':'C';
		
		System.out.println(score+ "점의 등급은?" +grade);
	}

}
