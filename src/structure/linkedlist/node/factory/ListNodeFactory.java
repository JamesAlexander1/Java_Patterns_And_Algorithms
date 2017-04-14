package structure.linkedlist.node.factory;

import java.util.concurrent.ThreadLocalRandom;

import structure.linkedlist.list.IntegerList;
import structure.linkedlist.node.IntegerListNode;
import structure.linkedlist.node.StringListNode;
import util.dao.filesystem.LocalProjectFileSystemDAO;
 public abstract class ListNodeFactory {

	 private static Integer MIN = 0;
	 private static Integer MAX = 100;
	 
	
	public static IntegerList getList(Integer numOfValues){
		
		IntegerList list = new IntegerList();
		
		// populate list.	
		for(int i = 0; i < numOfValues; i ++){
			
			list.AddRandom();
		}
		
		return list;
	}
	public static IntegerListNode[] getArray(Integer numOfValues){
		
		IntegerListNode[] array = new IntegerListNode[numOfValues];
		
		
		for(int i = 0; i < numOfValues; i ++){
			Integer randomNum = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
			array[i] = new IntegerListNode(randomNum);
		}
		
		return array;
	}
	
	public static StringListNode[] getStringArray(Integer num){
		
		StringListNode[] array = LocalProjectFileSystemDAO.getArray(num, "testfiles/1-1000.txt");
		return array;
	}
}
