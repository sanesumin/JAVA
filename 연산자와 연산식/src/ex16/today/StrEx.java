package ex16.today;

public class StrEx {

	public static void main(String[] args) {
		String strVar1 = "夢熱團";
		String strVar2 = "夢熱團";
		String strVar3 = new String("夢熱團");
		
		System.out.println(strVar1==strVar2);
		System.out.println(strVar2==strVar3);
		
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		System.out.println(strVar2.equals(strVar3));

	}

}
