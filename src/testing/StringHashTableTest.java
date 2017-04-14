package testing;

import structure.linkedlist.node.ListNodeFactory;
import structure.linkedlist.node.StringListNode;
import structures.hashtable.AbstractHashTable;
import structures.hashtable.StringDtoHashTableFactory;

public class StringHashTableTest {
	
	public static void main(String[] args) {
		
		StringListNode[] strings = ListNodeFactory.getStringArray(150);
		
		
		
		//to do: make factory
		AbstractHashTable<StringListNode> hashtable = new StringDtoHashTableFactory().getInstance();
		for(StringListNode dto : strings){
			hashtable.insert(dto);
		}
		hashtable.print();
	}

}
