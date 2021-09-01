/*
 * the MainFunctionQueue class implements a main function which performs operations of queue
 * @author Sanjana Rao
 * @since 1-09-2021
 */
public class MainFunctionQueue {

	public static void main(String[] args) 
	{
		System.out.println("Queue Operations");
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyNewQueue myQueue=new MyNewQueue();
		myQueue.enqueue(myFirstNode);
		myQueue.enqueue(mySecondNode);
		myQueue.enqueue(myThirdNode);
		myQueue.printQueue();
	}
}
