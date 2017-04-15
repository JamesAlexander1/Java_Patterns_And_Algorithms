package algorithms.sort.mergesort;

import structures.linkedlist.node.AbstractListNode;



/**
 * MergeSort Class implementing recursive Merge Sort given the first node in a list implementing AbstractListNode<E> which implements Comparable on <E>
 * @author James
 *
 * @param <E>	An class of objects held by AbstractDto for storage and comparison in the list.
 */
public class MergeSort<E> {

	/**
	 * Recursive MergeSort.
	 * @param listElement	- Node in a list extending AbstractListNode
	 * @return First element in list or sublist
	 */
	public AbstractListNode<E> mergeSort(AbstractListNode<E> listElement){
		
		
		AbstractListNode<E> linkA;
		AbstractListNode<E> linkB;
		
		if(listElement == null || listElement.getNextDto() == null){
			return listElement;
		}
		
		linkA = listElement;
		linkB = listElement.getNextDto();
		
		/**
		 * split list into 2 smaller lists.
		 */
		while(linkB != null && linkB.getNextDto() != null){
			
			listElement = listElement.getNextDto();
			linkB = linkB.getNextDto().getNextDto();
		}
		linkB = listElement.getNextDto();
		listElement.setNextDto(null);
		
		/**
		 * call merge() on 2 lists passed to recursive calls of mergeSort().
		 */
		return merge(mergeSort(linkA), mergeSort(linkB));
	}
	/**
	 * Combine step in Divide-Conquer-Combine of MergeSort ALgorithm
	 * @param listA	- 1 of 2 lists to combine.
	 * @param listB - 2 of 2 lists to combine
	 * @return first node in now sorted list/sublist.
	 */
	private AbstractListNode<E> merge(AbstractListNode<E> listA, AbstractListNode<E> listB){
		
		/**
		 *'first' will be first node of newly merged list.
		 * ListC will be next node in list from listA or B depending on compareTo().
		 */
		AbstractListNode<E> listC = null;
		AbstractListNode<E> first = null;
		
		/**
		 * Walk through both lists, adding to end of new list by order determined by compareTo().
		 */
		while(listA != null && listB != null){
			
			if(listA.compareTo(listB) <= 0){
				
				if(listC != null){
					
				
					listC.setNextDto(listA);
					
				}else{
					first = listA;
					
				}
				
				listC = listA;
				listA = listA.getNextDto();
				
			}else{
				if(listC != null){
					
					listC.setNextDto(listB);
					
				}else{
					first = listB;
					
				}
				
				listC = listB;
				listB = listB.getNextDto();
				
			}
		}
			
		/**
		 * set final node in newly merged list.
		 */
		listC.setNextDto(((listA == null ? listB : listA)));
		
		
		return first;
	}
}
