package algorithms.sort.factory;

import algorithms.sort.sortinterface.ISort;

/**
 * sorting algorithm factory Interface. Sorting algorithm factories should implement this interface
 * @author james
 *
 * @param <E>
 */
public interface ISortFactory<E> {

	public ISort<E> getInstance();
}
