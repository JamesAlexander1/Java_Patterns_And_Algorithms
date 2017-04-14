package algorithms.sort.mergesort;

import algorithms.sort.sortinterface.ISortFactory;
import structure.linkedlist.list.IntegerList;

/**
 * IntegerListMergeAlgorithm factory class.
 * @author james
 *
 */
public class IntMergeSortFactory implements ISortFactory<IntegerList>{

	@Override
	public IntegerListMergeAlgorithm getInstance() {
		
		return new IntegerListMergeAlgorithm();
	}

	
}
