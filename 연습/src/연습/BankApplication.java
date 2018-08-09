package ����;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			try {
			System.out.println("-----------------");
			System.out.println("1.���� ���� | 2.���¸�� |3.���� |4.��� | 5.����");
			System.out.println("-----------------");
			System.out.println("����>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}catch(Exception e) {
			break;
			}
		}
		System.out.println("���α׷� ����");
}	
	//���� �����ϱ�
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("���»���");
		System.out.println("---------");
		
		System.out.println("���¹�ȣ:");
		String ano = scanner.next();
		
		System.out.println("������:");
		String owner = scanner.next();
		
		System.out.println("�ʱ� �Աݾ�:");
		int balance = scanner.nextInt();
		
		int k = 0;
		while(accountArray[k]!=null) {
			k++;
		}
		accountArray[k] 
				= new Account(ano,owner,balance);
		System.out.println("���: ���°� �����Ǿ����ϴ�.");
		
		
	}
	
	//���� ��Ϻ���
	private static void accountList() {
		System.out.println("---------");
		System.out.println("���¸��");
		System.out.println("---------");
	
		for(Account account:accountArray) {
			  try {
			  if(account!=null) {
			  System.out.println(account.getAno()+"\t"+
			              account.getOwner()+"\t"+account.getBalance());
			}
			 }catch(NullPointerException ex) {
				 break;
			 }
		 }
	}
	
	//�����ϱ�
	private static void deposit() {
		System.out.println("---------");
		System.out.println("����");
		System.out.println("---------");
		
		
		System.out.println("���� ��ȣ:");
		String ano = scanner.next();
		 Account account = findAccount(ano);
		  
		System.out.println("���ݾ�:");
		int balance = scanner.nextInt();
		account.setBalance(account.getBalance()+balance);
		System.out.println("������ �����Ǿ����ϴ�.");
	}
	
	
	//����ϱ�
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("���");
		System.out.println("---------");
		
		
		System.out.println("���� ��ȣ:");
		String ano = scanner.next();
		Account account = findAccount(ano);
		
		System.out.println("��ݾ�:");
		int balance = scanner.nextInt();
		account.setBalance(account.getBalance()-balance);
		System.out.println("����� �����Ǿ����ϴ�.");
	}
	
	
	
		private static Account findAccount(String ano) {
			int k = 0;
			while(accountArray[k]!=null) {
				if(accountArray[k].getAno().equals(ano))break;
				k++;
			}
			return accountArray[k];
		}


	}


