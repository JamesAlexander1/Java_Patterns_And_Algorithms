package factory;

import dto.DtoList;
 public abstract class DtoFactory {

	
	public static DtoList getList(Integer numOfValues){
		
		DtoList list = new DtoList();
		
		// populate list.	
		for(int i = 0; i < numOfValues; i ++){
			
			list.AddRandom();
		}
		
		return list;
	}
	
}
