package structure.linkedlist.list;

import java.util.Random;

import structure.linkedlist.node.AbstractListNode;
import structure.linkedlist.node.DoubleListNode;

/**
 * List wrapper class for generating and using a list (queue) of nodes with Double values.
 * @author James
 *
 */
public class DoubleList {

	
	
	/**
	 * size - self explanatory.
	 * firstDto - first node (head) of linked list.
	 * isEmpty - self explanatory.
	 */
	private Integer size;
	private AbstractListNode<Double> firstDto;
	private boolean isEmpty;
	
	/**
	 * no argument constructor.
	 */
	private DoubleList(){
		
		size = 0;
		firstDto = null;
		
		isEmpty = true;
	}
	
	/**
	 * Add random method for adding a random Double value as a node at end of the list.
	 */
	public void AddRandom(){
		
		
		double random = new Random().nextDouble();
		if(isEmpty){
			
			firstDto = new DoubleListNode(random);
			
			
			isEmpty = false;
		}else{
			
			AbstractListNode<Double> newDto = new DoubleListNode(random);
			newDto.setNextDto(firstDto);
			firstDto = newDto;
			
			
		}
		
		size ++;
	}
	/**
	 * Pop first node (head) of list.
	 */
	public void pop(){
		
		firstDto = firstDto.getNextDto();
		size --;
	}
	/**
	 * Method for printing all values in List.
	 */
	public void print(){
		
		AbstractListNode<Double> printRef = this.firstDto;
		AbstractListNode<Double> temp = this.firstDto;
		Double sum = 0.0;
		for(int i = 0; i < size; i++){
			
			temp = printRef;
			System.out.println(printRef.getValue());
			
			printRef = printRef.getNextDto();
			if(printRef != null){
				sum += (printRef.getValue() - temp.getValue());
			}
		}
		System.out.println();
		System.out.println("SUM: " + sum);
		
	}
	
	/**
	 * getFirstDto() : return head node of list.
	 * @return firstDto - head of list.
	 */
	public AbstractListNode<Double> getFirstDto(){
		return firstDto;
	}
	/**
	 * setFirstDto() : set new head node of list (effectively adding a new list).
	 * @param abstractDto - new head of list.
	 */
	public void setFirstDto(AbstractListNode<Double> abstractDto){
		firstDto = abstractDto;
	}
	
	/**
	 * static factory method
	 * @return doubleList instance.
	 */
	public static DoubleList getInstance(){
		return new DoubleList();
	}
}
