package testing;


import structure.linkedlist.list.ListFactory;
import structure.linkedlist.node.AbstractListNode;
import structure.linkedlist.node.IntegerListNode;
import structures.hashtable.AbstractHashTable;
import structures.hashtable.IntegerHashTableFactory;



public class HashTableTesting {

	public static void main(String[] args) {
		

		
		
		IntegerListNode[] test1 = ListFactory.getArray(50);
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
