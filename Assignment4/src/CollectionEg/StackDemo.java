package CollectionEg;
import java.util.Stack;


	public class StackDemo {
	    public static void main(String[] args) {

	        Stack<String> stack = new Stack<>();

			// Push elements
			stack.push("A");
			stack.push("B");
			stack.push("C");

			System.out.println("Stack elements: " + stack);

			// Pop element
			stack.pop();
			System.out.println("After pop: " + stack);

			// Peek element
			System.out.println("Top element: " + stack.peek());
	    }
	}



