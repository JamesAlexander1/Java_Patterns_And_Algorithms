package algorithms.sort.mergesort;

import algorithms.sort.ISortFactory;
import structure.linkedlist.list.IntegerList;

/**
 * IntegerListMergeAlgorithm factory class.
 * @author james
 *
 */
public class IntMergeSortFactory implements  ISortFactory<IntegerList>{

	/**
	 * experimenting with different factory methods.
	 */
	static IntegerListMergeAlgorithm algo;
	static{
		algo = new IntegerListMergeAlgorithm();
	}
	
	@Override
	public IntegerListMergeAlgorithm getInstance() {
		
		return algo;
	}

	
}
