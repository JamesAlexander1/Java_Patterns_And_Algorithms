package structures.linkedlist.list;

import java.util.concurrent.ThreadLocalRandom;

import structures.linkedlist.node.IntegerListNode;
import structures.linkedlist.node.StringListNode;
import util.dao.filesystem.LocalProjectFileSystemDAO;

/**
 * Factory class for Integer and String value linked lists. To do: Double type support.
 * Is not thread safe in multithread environments.
 * @author James
 *
 */
 public abstract class ListFactory {

	 private static Integer MIN = 0;
	 private static Integer MAX = 100;
	 
	
	 /**
	  * Returns a IntegerList with 'numOfValues' number of random integer values from 0 to 100.
	  * @param numOfValues	- number of Integer values to add to linked list.
	  * @return	list 		- IntegerList reference.
	  */
	public static IntegerList getList(Integer numOfValues){
		
		IntegerList list = IntegerList.getInstance();
		
		// populate list.	
		for(int i = 0; i < numOfValues; i ++){
			
			list.AddRandom();
		}
		
		return list;
	}
	/**
	 * Returns an array of Integer linked list nodes.
	 * @param numOfValues	- number of values to add to the array.
	 * @return	array 		- IntegerListNode[numOfValues]
	 */
	public static IntegerListNode[] getArray(Integer numOfValues){
		
		IntegerListNode[] array = new IntegerListNode[numOfValues];
		
		
		for(int i = 0; i < numOfValues; i ++){
			Integer randomNum = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
			array[i] = new IntegerListNode(randomNum);
		}
		
		return array;
	}
	
	/**
	 * returns an array of linked list nodes with String values.
	 * @param num		- number of random word Strings to add to array.
	 * @return array 	- StringListNode[num]	
	 */
	public static StringListNode[] getStringArray(Integer num){
		
		StringListNode[] array = LocalProjectFileSystemDAO.getArray(num, "testfiles/1-1000.txt");
		return array;
	}
}
