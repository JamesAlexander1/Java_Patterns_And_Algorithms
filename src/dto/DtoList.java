package dto;

import java.util.concurrent.ThreadLocalRandom;

// Quick Stack implementation.

public class DtoList {

	private static Integer MIN = 0;
	private static Integer MAX = 100;
	
	private Integer size;
	private AbstractDto<Integer> firstDto;
	
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
			
			AbstractDto<Integer> newDto = new Dto(randomNum);
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
		
		AbstractDto<Integer> printRef = this.firstDto;
		
		for(int i = 0; i < size; i++){
			
			System.out.println(printRef.getValue());
			printRef = printRef.getNextDto();
		}
		System.out.println();
	}
	
	public AbstractDto<Integer> getFirstDto(){
		return firstDto;
	}
	public void setFirstDto(AbstractDto<Integer> abstractDto){
		firstDto = abstractDto;
	}
}
