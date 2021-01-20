import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class is part of Lab 1 for ITSC 2214: Data Structures.
 * As stated in the assignment instructions, this class reads in the input file
 * and parses the data into MyList objects, which are then added to the stack.
 * The count and contents of the stack are then printed both before and after the 
 * stack is popped 3 times to test the stack's implementation.
 */
public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		MyStack stack = new MyStack(); //create the stack
		
		try {
			Scanner scanner = new Scanner(new File("Lab1InputFile.txt")); //open the input file
			String name; String id; Integer credits;
			
			while(scanner.hasNextLine()) {
				name = scanner.nextLine(); //read in data from the file
				id = scanner.nextLine();
				credits = scanner.nextInt();
				scanner.nextLine(); //consume the newline
				//create a MyList object from the input and push it onto the stack
				stack.push(new MyList(name, id, credits));
			}
			scanner.close();
		}catch(FileNotFoundException ex) {
			System.err.println("Error: File not found.");
		}
		
		System.out.println("Reading in data from input file...");
		System.out.println("\nCount: " + stack.count());
		System.out.println("Contents of stack: \n" + stack.toString());
		
		System.out.println("\n\nPopping 3 elements from the stack...");
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("\nCount: " + stack.count());
		System.out.println("Contents of stack: \n" + stack.toString());
	}
}
