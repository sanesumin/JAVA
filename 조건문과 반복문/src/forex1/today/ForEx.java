package forex1.today;

public class ForEx {

	public static void main(String[] args) {
		int sum1 = 0,sum2 = 0, sum = 0;
		int i;
		int j;
		for(i=1,j=51; i<=50 && j<=100; i++,j++) {
			sum1 = sum1 + i;
			sum2 = sum2 + j;
		}
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		sum= sum1 + sum2;
		
		System.out.println("1~"+(j-1)+"까지의 합"+sum);

	}

}
