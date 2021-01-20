/**
 * This class is part of Lab 1 for ITSC 2214: Data Structures.
 */
public class MyStack {
	private MyList head;
	private int count;
	
	/**
	 * A constructor for the MyStack class that initializes an empty stack.
	 */
	public MyStack() {
		this.head = null;
		this.count = 0;
	}
	
	/**
	 * A constructor for the MyStack class that sets the first item in the stack to
	 * the parameter.
	 * @param first: The first item to put in the stack.
	 */
	public MyStack(MyList first) {
		this.head = first;
		this.count = 1;
	}
	
	/**
	 * Adds the MyList object to the top/head of the stack.
	 * @param node: The object to add to the stack.
	 */
	public void push(MyList node) {
		node.setNext(head);
		head = node;
		count++;
	}
	
	/**
	 * Removes and returns the element at the top of the stack.
	 * @return head: the element that was at the top of the stack.
	 */
	public MyList pop(){
		if(count == 0) {
			System.err.println("Error: The stack is empty.");
			return null;
		}
		MyList temp = head;
		head = head.getNext();
		count--;
		return temp;
	}
	
	/**
	 * Returns the element at the top of the stack without removing it from the stack.
	 * @return head: the element at the top of the stack.
	 */
	public MyList peek() {
		return head;
	}
	
	/**
	 * Returns the number of elements in the stack.
	 * @return count: the number of elements.
	 */
	public int count(){
		return count;
	}
	
	/**
	 * Returns a formatted string of all the elements in the stack, separated by lines.
	 * @return output: a concatenated string of each MyList object in the stack.
	 */
	@Override
	public String toString(){
		String output = "-------------------------------------------------------------";
		MyList temp = head;
		for(int i = 0; i < this.count; i++) {
			output += temp.toString();
			output += "\n-------------------------------------------------------------";
			temp = temp.getNext();
		}
		return output;
	}
}