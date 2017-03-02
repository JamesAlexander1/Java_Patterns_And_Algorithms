package factory;

import abstractSort.AbstractSort;

public interface AbstractSortFactory<E> {

	public AbstractSort<E> getInstance();
}
