package ex.day0621;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String inputString; //초기식
		
		do {
			System.out.println(">");
			inputString= scanner.nextLine();
			System.out.println(inputString);
			//증감식->변화
			//에코프로그램
			
		}while( ! inputString.equals("q") );//조건문 -> 종료조건
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}
