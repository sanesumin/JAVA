import java.util.Arrays;
import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.println("���� ��ȣ:");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.println(selectNumber[i]+" ");
		}
		System.out.println();
		
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.println("��÷ ��ȣ:");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.println(selectNumber[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.println("��÷ ����:");
		if(result) {
			System.out.println("1� ��÷�Ǽ̽��ϴ�.");
		}else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
		

	}

}
