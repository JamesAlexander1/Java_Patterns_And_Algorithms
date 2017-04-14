package structure.linkedlist.list;

import java.util.concurrent.ThreadLocalRandom;

import structure.linkedlist.node.AbstractListNode;
import structure.linkedlist.node.IntegerListNode;

// Quick Stack implementation.

public class IntegerList {

	private static Integer MIN = 0;
	private static Integer MAX = 100;
	
	private Integer size;
	private AbstractListNode<Integer> firstDto;
	
	private boolean isEmpty;
	
	
	public IntegerList(){
		
		size = 0;
		firstDto = null;
		
		isEmpty = true;
	}
	
	public void AddRandom(){
		
		Integer randomNum = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
		
		if(isEmpty){
			
			firstDto = new IntegerListNode(randomNum);
			
			
			isEmpty = false;
		}else{
			
			AbstractListNode<Integer> newDto = new IntegerListNode(randomNum);
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
		
		AbstractListNode<Integer> printRef = this.firstDto;
		
		for(int i = 0; i < size; i++){
			
			System.out.println(printRef.getValue());
			printRef = printRef.getNextDto();
		}
		System.out.println();
	}
	
	public AbstractListNode<Integer> getFirstDto(){
		return firstDto;
	}
	public void setFirstDto(AbstractListNode<Integer> abstractDto){
		firstDto = abstractDto;
	}
}
