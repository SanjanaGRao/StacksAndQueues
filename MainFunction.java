/*
 * the MainFunction class implements a main function which performs operations of stacks and queue
 * @author Sanjana Rao
 * @since 1-09-2021
 */

public class MainFunction {
	
	public static void main(String[] args)
	{
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);		
		MyNewStack myStack=new MyNewStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
	}
}
