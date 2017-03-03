package hashtable;
import pojo.IPojo;

public abstract class AbstractHashTable<E> {
	
	protected Integer tableSize;
	
	public abstract void insert(E item);
	public abstract E remove(E item);
	protected abstract void resize();
	public abstract void print();
	
	
}
