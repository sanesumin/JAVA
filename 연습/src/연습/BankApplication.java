package 연습;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			try {
			System.out.println("-----------------");
			System.out.println("1.계좌 생성 | 2.계좌목록 |3.예금 |4.출금 | 5.종료");
			System.out.println("-----------------");
			System.out.println("선택>");
			
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
		System.out.println("프로그램 종료");
}	
	//계좌 생성하기
	private static void createAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");
		
		System.out.println("계좌번호:");
		String ano = scanner.next();
		
		System.out.println("계좌주:");
		String owner = scanner.next();
		
		System.out.println("초기 입금액:");
		int balance = scanner.nextInt();
		
		int k = 0;
		while(accountArray[k]!=null) {
			k++;
		}
		accountArray[k] 
				= new Account(ano,owner,balance);
		System.out.println("결과: 계좌가 생성되었습니다.");
		
		
	}
	
	//계좌 목록보기
	private static void accountList() {
		System.out.println("---------");
		System.out.println("계좌목록");
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
	
	//예금하기
	private static void deposit() {
		System.out.println("---------");
		System.out.println("예금");
		System.out.println("---------");
		
		
		System.out.println("계좌 번호:");
		String ano = scanner.next();
		 Account account = findAccount(ano);
		  
		System.out.println("예금액:");
		int balance = scanner.nextInt();
		account.setBalance(account.getBalance()+balance);
		System.out.println("예금이 성공되었습니다.");
	}
	
	
	//출금하기
	private static void withdraw() {
		System.out.println("---------");
		System.out.println("출금");
		System.out.println("---------");
		
		
		System.out.println("계좌 번호:");
		String ano = scanner.next();
		Account account = findAccount(ano);
		
		System.out.println("출금액:");
		int balance = scanner.nextInt();
		account.setBalance(account.getBalance()-balance);
		System.out.println("출금이 성공되었습니다.");
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


