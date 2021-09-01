/*
 *  The class MyNode implements the interface INode which will set the getter and setter values.
 *  @author Sanjana Rao
 *  @since 1-09-2021
 */
public class MyNode<K> implements INode<K>{
	
	private K key;
	private INode<K> next;
	
	public MyNode(K key)
	{
		key = null;
	}
	
	@Override
	public K getKey()
	{
		return key;
	}
	
	@Override
	public void setKey(K key)
	{
		this.key = key;
	}
	
	public INode<K> getNext()
	{
		return next;
	}
	
	public void setNext(INode<K> next)
	{
		this.next = next;
	}
	
	@Override
	public String toString()
	{
		StringBuilder myNodeString = new StringBuilder();
		myNodeString.append("MyNode{" + "key=").append(key).append('}');
		if(next!=null)
		{
			myNodeString.append("->").append(next);
		}
			return myNodeString.toString();
		
	}
}
