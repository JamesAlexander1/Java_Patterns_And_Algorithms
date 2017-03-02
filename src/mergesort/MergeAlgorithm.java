package mergesort;

import abstractSort.AbstractSort;
import dto.DtoList;

public class MergeAlgorithm implements AbstractSort<DtoList> {

	
	public void sort(DtoList list){
		
		list.setFirstDto(MergeSort.mergeSort(list.getFirstDto()));
		//return list;
	}
}
