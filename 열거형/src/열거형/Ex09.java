package 열거형;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		
		while(run) {
			System.out.println("-----------");
			System.out.println("1.학생수 | 2.점수입력 "
					+ "|3.점수리스트 | 4.분석 | 5. 종료");
			System.out.println("-----------");
			System.out.println("선택>");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생수>");
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
				System.out.println("최고 점수:"+max);
				System.out.println("평균 점수:"+avg);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
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

	     if(temp[j]>temp[i]) {        //버블소트(Bubble Sort)

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


