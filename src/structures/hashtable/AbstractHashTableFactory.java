package structures.hashtable;

/**
 * Abstract Hashtable factory for other factories to extend. Again, should be interface.
 * @author james
 *
 * @param <E>
 */
public abstract class AbstractHashTableFactory<E>{

	
	public abstract AbstractHashTable<E> getInstance();
}
