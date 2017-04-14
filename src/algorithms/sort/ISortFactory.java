package algorithms.sort;

/**
 * sorting algorithm factory interface. Sorting algorithm factories should implement getInstance.
 * @author james
 *
 * @param <E>
 */
public interface ISortFactory<E> {

	public ISort<E> getInstance();
}
