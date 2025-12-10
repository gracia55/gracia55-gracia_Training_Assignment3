package pkg;
import java.util.*;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character/word to replace: ");
        String oldValue = sc.nextLine();

        System.out.print("Enter new character/word: ");
        String newValue = sc.nextLine();

        String result = str.replace(oldValue, newValue);

        System.out.println("Result after replacement: " + result);

        sc.close();
    }
}
