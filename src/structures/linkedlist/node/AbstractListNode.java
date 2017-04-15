package structures.linkedlist.node;

/**
 * Abstract Class specifying methods for a a linked list node implementation
 * @author james
 *
 * @param <E>	- the class / primitive type for the list to be sorted on
 */
public abstract class AbstractListNode<E> implements Comparable<AbstractListNode<E>>{

	public abstract E getValue();
	public abstract void setValue(E value);
	public abstract AbstractListNode<E> getNextDto();
	public abstract void setNextDto(AbstractListNode<E> value);
	public abstract int compareTo(AbstractListNode<E> listB);
}
