package algorithms.sort.mergesort;

import algorithms.sort.sortinterface.ISort;
import structure.linkedlist.list.DoubleList;

/**
 * Merge Sort class for linked lists with Double type node values.
 * @author James
 *
 */
public class DoubleListMergeAlgorithm implements ISort<DoubleList> {

	/**
	 * Mergesort Algorithm - strategy pattern.
	 */
	private MergeSort<Double> algorithm;
	
	/**
	 * 0 argument constructor. 
	 */
	public DoubleListMergeAlgorithm(){
		algorithm = new MergeSort<Double>();
	}
	
	/**
	 * sort method. Takes the head node of a linked list of type DoubleList. 
	 */
	@Override
	public void sort(DoubleList list) {
		
		list.setFirstDto(algorithm.mergeSort(list.getFirstDto()));
		
	}

}
