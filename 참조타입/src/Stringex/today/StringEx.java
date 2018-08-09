package Stringex.today;

public class StringEx {

	public static void main(String[] args) {
		String str1 = "박수민";
		String str2 = "박수민";
		
		//System.out.println(str1==str2);//true,주소비교
		//System.out.println(str2==str3);//false
		//System.out.println(str1.equals(str2));//true,내용비교
		//System.out.println(str2.equals(str3));//true
		
		if(str1==str2) {//참조가 같음
			System.out.println("str1과 str2는 참조가 같음");
		}else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		
		if(str1.equals(str2)) {//문자열이 같음
			System.out.println("str1과 str2의 문자열이 같음");
		}
		
		String str3 = new String("박수민");
		String str4 = new String("박수민");
		

		if(str3==str4) {//참조가 다름
			System.out.println("str1과 str2는 참조가 같음");
		}else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		
		if(str3.equals(str4)) {//문자열이 같음
			System.out.println("str1과 str2의 문자열이 같음");
		}
		
	}

}
