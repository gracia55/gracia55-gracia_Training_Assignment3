package pkg;
import java.util.*;
public class CountPNZ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of elements: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int positive = 0, negative = 0, zero = 0;

		for (int num : arr) {
			if (num > 0)
				positive++;
			else if (num < 0)
				negative++;
			else
				zero++;
		}

		System.out.println("Positive elements: " + positive);
		System.out.println("Negative elements: " + negative);
		System.out.println("Zero elements: " + zero);

	}

}
