package pkg;
import java.util.*;
public class CountChar {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        int alphabets = 0, digits = 0, special = 0;

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (Character.isLetter(ch)) {
	                alphabets++;
	            } else if (Character.isDigit(ch)) {
	                digits++;
	            } else {
	                special++;
	            }
	        }

	        System.out.println("Alphabets: " + alphabets);
	        System.out.println("Digits: " + digits);
	        System.out.println("Special characters: " + special);

	        sc.close();
	    }

}
