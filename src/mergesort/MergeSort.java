package mergesort;

import dto.Dto;


public abstract class MergeSort {

	
	public static Dto mergeSort(Dto listElement){
		
		
		Dto linkA;
		Dto linkB;
		
		if(listElement == null || listElement.getNextDto() == null){
			return listElement;
		}
		
		linkA = listElement;
		linkB = listElement.getNextDto();
		
		while(linkB != null && linkB.getNextDto() != null){
			
			listElement = listElement.getNextDto();
			linkB = linkB.getNextDto().getNextDto();
		}
		linkB = listElement.getNextDto();
		listElement.setNextDto(null);
		
		
		return Merge.merge(MergeSort.mergeSort(linkA), MergeSort.mergeSort(linkB));
	}
}
