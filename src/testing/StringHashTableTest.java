package testing;

import structures.hashtable.AbstractHashTable;
import structures.hashtable.StringDtoHashTableFactory;
import structures.linkedlist.list.ListFactory;
import structures.linkedlist.node.StringListNode;

public class StringHashTableTest {
	
	public static void main(String[] args) {
		
		StringListNode[] strings = ListFactory.getStringArray(150);
		
		
		
		//to do: make factory
		AbstractHashTable<StringListNode> hashtable = new StringDtoHashTableFactory().getInstance();
		for(StringListNode dto : strings){
			hashtable.insert(dto);
		}
		hashtable.print();
	}

}
