package mergesort;

import abstractSort.AbstractSort;
import dto.AbstractDto;
import dto.DtoList;

public class IntegerMergeAlgorithm implements AbstractSort<DtoList> {

	private MergeSort<Integer> algorithm;
	public IntegerMergeAlgorithm(){
		algorithm = new MergeSort<Integer>();
	}
	public void sort(DtoList list){
		
		list.setFirstDto(algorithm.mergeSort(list.getFirstDto()));
		//return list;
	}
	
}
