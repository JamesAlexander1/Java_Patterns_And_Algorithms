package testing;


import structures.hashtable.AbstractHashTable;
import structures.hashtable.IntegerHashTableFactory;
import structures.linkedlist.list.ListFactory;
import structures.linkedlist.node.AbstractListNode;
import structures.linkedlist.node.IntegerListNode;



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
