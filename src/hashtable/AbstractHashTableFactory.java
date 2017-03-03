package hashtable;
import pojo.IPojo;
public abstract class AbstractHashTableFactory<E>{

	
	public abstract AbstractHashTable<E> getInstance();
}
