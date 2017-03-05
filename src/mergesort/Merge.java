package mergesort;

import dto.AbstractDto;
import dto.Dto;


public abstract class Merge {

	
	public static AbstractDto<Integer> merge(AbstractDto<Integer> listA, AbstractDto<Integer> listB){
		
		AbstractDto<Integer> listC = null;
		AbstractDto<Integer> first = null;
		//System.out.println("merging: a = " + listA.getValue() + " and b = " + listB.getValue());
		while(listA != null && listB != null){
			
			if(listA.compareTo(listB) <= 0){
				
				if(listC != null){
					
				
					listC.setNextDto(listA);
					
				}else{
					first = listA;
					//System.out.println("first set");
				}
				
				listC = listA;
				listA = listA.getNextDto();
			}else{
				if(listC != null){
					
					listC.setNextDto(listB);
					
				}else{
					first = listB;
					//System.out.println("first set");
				}
				
				listC = listB;
				listB = listB.getNextDto();
				
			}
		}
			
		listC.setNextDto(((listA == null ? listB : listA)));
		
		//System.out.println("returning: " + first.getValue()); //+ " -> " + first.getNextDto().getValue());
		return first;
	}
}
