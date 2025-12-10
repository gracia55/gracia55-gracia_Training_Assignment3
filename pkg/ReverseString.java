package pkg;
import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();   // in-built method to reverse

        System.out.println("Reversed string: " + sb);

        sc.close();
    }
}
