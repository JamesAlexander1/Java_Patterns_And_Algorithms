package dto;

import java.util.concurrent.ThreadLocalRandom;

// Quick Stack implementation.

public class DtoList {

	private static Integer MIN = 0;
	private static Integer MAX = 100;
	
	private Integer size;
	private Dto firstDto;
	
	private boolean isEmpty;
	
	
	public DtoList(){
		
		size = 0;
		firstDto = null;
		
		isEmpty = true;
	}
	
	public void AddRandom(){
		
		Integer randomNum = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
		
		if(isEmpty){
			
			firstDto = new Dto(randomNum);
			
			
			isEmpty = false;
		}else{
			
			Dto newDto = new Dto(randomNum);
			newDto.setNextDto(firstDto);
			firstDto = newDto;
			
			
		}
		
		size ++;
	}
	public void pop(){
		
		firstDto = firstDto.getNextDto();
		size --;
	}
	public void print(){
		
		Dto printRef = this.firstDto;
		
		for(int i = 0; i < size; i++){
			
			System.out.println(printRef.getValue());
			printRef = printRef.getNextDto();
		}
		System.out.println();
	}
	
	public Dto getFirstDto(){
		return firstDto;
	}
	public void setFirstDto(Dto first){
		firstDto = first;
	}
}
