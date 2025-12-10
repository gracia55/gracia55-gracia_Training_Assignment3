package pkg;
import java.util.*;
public class SortCharacters {
	 public static void main(String[] args)
	 {
	Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    char[] arr = str.toCharArray();  // convert string to char array
    Arrays.sort(arr);               // sort characters

    String sorted = new String(arr);

    System.out.println("Sorted string: " + sorted);

    sc.close();
}

}
