package ������;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		
		while(run) {
			System.out.println("-----------");
			System.out.println("1.�л��� | 2.�����Է� "
					+ "|3.��������Ʈ | 4.�м� | 5. ����");
			System.out.println("-----------");
			System.out.println("����>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("�л���>");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for(int i=0;i<studentNum;i++) {
					System.out.println("scores["+i+"]>");
					scores[i] = scanner.nextInt();
				}
				
			}else if(selectNo == 3) {
				for(int i=0; i<studentNum;i++) {
					System.out.println("scores["+i+"]:"+scores[i]);
				}
				
			}else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				int[] sorted = new int[scores.length];
				
				for(int i=0; i<scores.length;i++) {
					sum += scores[i];
				}
				sorted = sort(scores);
				max = sorted[0];
				
				avg = (double) sum/ studentNum;
				System.out.println("�ְ� ����:"+max);
				System.out.println("��� ����:"+avg);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
	}

		static int[] sort(int[] arr) {

	  int temp[] = new int[arr.length];

	  System.arraycopy(arr, 0, temp, 0, arr.length);

	  //System.out.println();  

	  for(int t:temp) {

	  //System.out.print(""+t+", ");

	  }

	  

	  for(int i=0;i<arr.length;i++) {

	    for(int j=i;j<arr.length;j++) {

	     if(temp[j]>temp[i]) {        //�����Ʈ(Bubble Sort)

	      int a = temp[i];

	      temp[i] = temp[j];

	      temp[j] = a;

	    }

	    }

	  }  

	  //System.out.println();

	  for(int t:temp) {

	  //System.out.print(""+t+", ");

	  }
	  return temp;

		}
	}


