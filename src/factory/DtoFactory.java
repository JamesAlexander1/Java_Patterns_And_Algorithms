package factory;

import java.util.concurrent.ThreadLocalRandom;

import dao.LocalProjectFileSystemDAO;
import dto.Dto;
import dto.DtoList;
import dto.StringDto;
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
	
	public static StringDto[] getStringArray(Integer num){
		
		StringDto[] array = LocalProjectFileSystemDAO.getArray(num, "testfiles/1-1000.txt");
		return array;
	}
}
