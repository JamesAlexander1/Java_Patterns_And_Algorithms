package algorithms.sort.factory;

import algorithms.sort.mergesort.IntegerListMergeAlgorithm;
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
