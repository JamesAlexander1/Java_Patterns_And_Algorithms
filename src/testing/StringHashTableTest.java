package testing;

import hashtable.AbstractHashTable;

import hashtable.StringDtoHashTableFactory;
import structure.linkedlist.node.StringListNode;
import structure.linkedlist.node.factory.ListNodeFactory;

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
