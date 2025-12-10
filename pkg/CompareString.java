package pkg;
import java.util.*;
public class CompareString {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // equals() comparison
        if (str1.equals(str2)) {
            System.out.println("Strings are EQUAL using equals()");
        } else {
            System.out.println("Strings are NOT equal using equals()");
        }

        // compareTo() comparison
        int result = str1.compareTo(str2);

        if (result == 0)
            System.out.println("Strings are EQUAL using compareTo()");
        else if (result > 0)
            System.out.println("String 1 is GREATER than String 2 using compareTo()");
        else
            System.out.println("String 1 is SMALLER than String 2 using compareTo()");

        sc.close();
    }

}
