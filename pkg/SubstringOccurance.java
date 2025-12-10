package pkg;
import java.util.*;
public class SubstringOccurance {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        System.out.print("Enter substring to count: ");
	        String sub = sc.nextLine();

	        int count = 0;
	        int index = 0;

	        while ((index = str.indexOf(sub, index)) != -1) {
	            count++;
	            index = index + sub.length();   // move index forward
	        }

	        System.out.println("Occurrences of substring: " + count);

	        sc.close();
	    }

}
