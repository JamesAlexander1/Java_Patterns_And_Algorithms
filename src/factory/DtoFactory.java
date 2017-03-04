package factory;

import java.util.concurrent.ThreadLocalRandom;

import dto.Dto;
import dto.DtoList;
 public abstract class DtoFactory {

	 private static Integer MIN = 0;
	 private static Integer MAX = 100;
	 
	
	public static DtoList getList(Integer numOfValues){
		
		DtoList list = new DtoList();
		
		// populate list.	
		for(int i = 0; i < numOfValues; i ++){
			
			list.AddRandom();
		}
		
		return list;
	}
	public static Dto[] getArray(Integer numOfValues){
		
		Dto[] array = new Dto[numOfValues];
		
		
		for(int i = 0; i < numOfValues; i ++){
			Integer randomNum = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
			array[i] = new Dto(randomNum);
		}
		
		return array;
	}
}
