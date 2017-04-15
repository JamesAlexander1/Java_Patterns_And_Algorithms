package algorithms.sort.mergesort;

import algorithms.sort.ISort;
import structures.linkedlist.list.DoubleList;

/**
 * Merge Sort class for linked lists with Double type node values. also has a static factory method.
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
	private DoubleListMergeAlgorithm(){
		algorithm = new MergeSort<Double>();
	}
	
	/**
	 * sort method. Takes the head node of a linked list of type DoubleList. 
	 */
	@Override
	public void sort(DoubleList list) {
		
		list.setFirstDto(algorithm.mergeSort(list.getFirstDto()));
		
	}
	
	/**
	 * static Factory method.
	 * @return new DoubleListMergeAlgorithm
	 */
	public static DoubleListMergeAlgorithm getInstance(){
		return new DoubleListMergeAlgorithm();
	}
	

}
