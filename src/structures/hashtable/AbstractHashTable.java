package structures.hashtable;


/**
 * Abstract class for Hashtable implementations to extend
 * Should probably be an interface.
 * @author james
 *
 * @param <E>	- class of object to store in hashtable.
 */
public abstract class AbstractHashTable<E> {
	
	protected Integer tableSize;
	
	public abstract void insert(E item);
	public abstract E remove(E item);
	protected abstract void resize();
	public abstract void print();
	
	
}
