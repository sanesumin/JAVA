package ex.day0621;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----");
			System.out.println("1.���� | 2.��� | 3.�ܰ� |4.����");
			System.out.println("------");
			System.out.println("����>");
			
			int num = scanner.nextInt();
			
			if(num==1) {
				System.out.println("���ݾ�>");
				balance += scanner.nextInt();
			}else if(num==2) {
				System.out.println("��ݾ�>");
				balance -= scanner.nextInt();
		   }else if(num==3) {
			System.out.println("�ܰ�>"+balance);
			
			}else if(num==4) {
				run = false;
			}

		}
		System.out.println("���α׷� ����");
	}
	

}


