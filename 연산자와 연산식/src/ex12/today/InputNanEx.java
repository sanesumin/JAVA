package ex12.today;

public class InputNanEx {

	public static void main(String[] args) {
		String userInput = "NaN";
		
		double val = Double.valueOf(userInput);
		
		if(Double.isNaN(val)) {
			System.out.println("NaN�� �ԷµǾ� ó���Ҽ� �����ϴ�.");
			val = 0.0;
		}
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);

	}

}
