package algorithms.sort.mergesort;

import algorithms.sort.ISort;
import structures.linkedlist.list.IntegerList;

/**
 * Merge Sort implementation for a integer linked list.
 * @author James
 *
 */
public class IntegerListMergeAlgorithm implements ISort<IntegerList> {

	/**
	 * Merge Sort implementation - Strategy Pattern.
	 */
	private MergeSort<Integer> algorithm;
	/**
	 * No argument constructor.
	 */
	protected IntegerListMergeAlgorithm(){
		algorithm = new MergeSort<Integer>();
	}
	
	/**
	 * Sort method. Takes head of list as an argument. Returns head of sorted list.
	 */
	public void sort(IntegerList list){
		
		list.setFirstDto(algorithm.mergeSort(list.getFirstDto()));
		//return list;
	}
	
}
