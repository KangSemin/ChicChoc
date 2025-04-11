import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int[] num = new int[3];
		int max =0, sum=0;

		for (int i = 0; i < 3; i++) {
			num[i] = scanner.nextInt();
			if (num[i] > max) {
				max = num[i];
			}
			sum += num[i];
		}

		System.out.println(sum - max <= max ? (sum-max)*2-1 : sum);
	}
	
}