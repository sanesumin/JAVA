package ex.day0621;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q���Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		String inputString; //�ʱ��
		
		do {
			System.out.println(">");
			inputString= scanner.nextLine();
			System.out.println(inputString);
			//������->��ȭ
			//�������α׷�
			
		}while( ! inputString.equals("q") );//���ǹ� -> ��������
		
		System.out.println();
		System.out.println("���α׷� ����");
	}

}
