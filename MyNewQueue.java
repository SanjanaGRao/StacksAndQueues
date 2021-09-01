/*
	 *  The class MyQueue is created in order to understand how Stacks and Queue work.
	 *  The class also performs simple operation on Queue
	 *  @myLinkedList is created because a queue data structure can be implemented using linked list data.
	 *  @author Sanjana Rao
	 *  @since 1-09-2021
	 */
public class MyNewQueue {
	
			private final MyLinkedList<Integer> myLinkedList;
			
			public MyNewQueue()
			{
				myLinkedList=new MyLinkedList<Integer>();
			}
			
			/*
			 * The method Enqueue adds elements to the queue
			 * @param element to be added to queue
			 */
			public void enqueue(INode<Integer> element)
			{
				myLinkedList.append(element);
			}
			
			/*
			 * The method printQueue prints the elements of the stack
			 */
			public void printQueue()
			{
				myLinkedList.printMyNodes();
			}
}

