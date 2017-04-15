package structures.linkedlist.list;

import java.util.concurrent.ThreadLocalRandom;

import structures.linkedlist.node.AbstractListNode;
import structures.linkedlist.node.IntegerListNode;


/**
 * Integer Queue.
 * @author James
 *
 */
public class IntegerList {

	/**
	 * Max range for random number generator.
	 */
	private static Integer MIN = 0;
	private static Integer MAX = 100;
	
	/**
	 * size - self explanatory.
	 * firstDto - first node (head) of queue.
	 * isEmpty - self explanatory.
	 */
	private Integer size;
	private AbstractListNode<Integer> firstDto;
	
	private boolean isEmpty;
	
	
	/**
	 * 0 argument constructor
	 */
	private IntegerList(){
		
		size = 0;
		firstDto = null;
		
		isEmpty = true;
	}
	
	/**
	 * Add a random number between and including MIN up to MAX to the list.
	 */
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
	
	/**
	 * pop head of list off queue.
	 */
	public void pop(){
		
		firstDto = firstDto.getNextDto();
		size --;
	}
	/**
	 * print list.
	 */
	public void print(){
		
		AbstractListNode<Integer> printRef = this.firstDto;
		
		for(int i = 0; i < size; i++){
			
			System.out.println(printRef.getValue());
			printRef = printRef.getNextDto();
		}
		System.out.println();
	}
	
	/**
	 * getter method for head node of List.
	 * @return
	 */
	public AbstractListNode<Integer> getFirstDto(){
		return firstDto;
	}
	/**
	 * setter method for head node of list.
	 * @param abstractDto
	 */
	public void setFirstDto(AbstractListNode<Integer> abstractDto){
		firstDto = abstractDto;
	}
	
	/**
	 * static factory method
	 * @return Integerlist instance.
	 */
	public static IntegerList getInstance(){
		return new IntegerList();
	}
}
