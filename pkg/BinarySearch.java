package pkg;
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        int start = 0;
        int end = n - 1;
        boolean found = false;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == search) {
                System.out.println(search + " found at position " + (mid + 1));
                found = true;
                break;
            } 
            else if (arr[mid] < search) {
                start = mid + 1; // search in right half
            } 
            else {
                end = mid - 1; // search in left half
            }
        }

        if (!found) {
            System.out.println(search + " not found in the array.");
        }

       
    }


}
