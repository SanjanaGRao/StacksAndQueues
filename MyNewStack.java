 /*
	 *  The class MyNewStack is created in order to understand how Stacks work.
	 *  The class also performs simple operation on Stacks like pushing and popping
	 *  @myLinkedList is created because a stack data structure can be implemented using linked list data.
	 *  @author Sanjana Rao
	 *  @since 1-h09-2021
	 */
public class MyNewStack {
	
	private final MyLinkedList<Integer> myLinkedList;
	
	public MyNewStack()
	{
		myLinkedList=new MyLinkedList<Integer>();
	}
	
	/*
	 * The method push adds an element into the stack
	 * @param element is the element to be added to stack
	 */
	public void push(INode<Integer> element)
	{
		myLinkedList.add(element);
	}
	
	/*
	 * The method peak is to get the topmost element of the stack
	 * @returns the top most element of the stack
	 */
	public Integer peak()
	{
		return myLinkedList.head.getKey();
	}
	
	/*
	 * Pop method removes the elements from the top of the stack
	 * @returns the stack
	 */
	public INode<Integer> pop()
	{
		return myLinkedList.pop();
	}
	
	/*
	 * printStack is a method to print elements of the stack
	 */
	public void printStack()
	{
		myLinkedList.printMyNodes();
	}
}
