package pkg;
import java.util.*;
public class SearchElement {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                System.out.println(search + " found at position " + (i + 1));
                found = true;
                break; // stop when element is found
            }
        }

        if (!found) {
            System.out.println(search + " not found in the array.");
        }

      
    }

}
