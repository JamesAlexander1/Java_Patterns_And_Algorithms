package testing;


import hashtable.AbstractHashTable;

import hashtable.IntegerHashTableFactory;
import structure.linkedlist.node.AbstractListNode;
import structure.linkedlist.node.IntegerListNode;
import structure.linkedlist.node.factory.ListNodeFactory;



public class HashTableTesting {

	public static void main(String[] args) {
		

		
		
		IntegerListNode[] test1 = ListNodeFactory.getArray(50);
		AbstractHashTable<AbstractListNode<Integer>> hashtable = new IntegerHashTableFactory().getInstance();
		
		System.out.print("initial array: ");
		for(IntegerListNode temp : test1){
			System.out.print(temp.getValue() + " ");
		}
		
		for(IntegerListNode temp: test1){
			hashtable.insert(temp);
		}
		
		hashtable.print();
		
		
		
		
	}

}
