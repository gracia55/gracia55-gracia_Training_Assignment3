package pkg;
import java.util.*;
public class SecondSmallest {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr); // ascending order

        int smallest = arr[0];
        int secondSmallest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != smallest) {
                secondSmallest = arr[i];
                break;
            }
        }

        System.out.println("Second Smallest = " + secondSmallest);

        sc.close();
    }

}
