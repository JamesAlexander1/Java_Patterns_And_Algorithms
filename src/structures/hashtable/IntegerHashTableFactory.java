package structures.hashtable;


import structures.linkedlist.node.AbstractListNode;
import structures.linkedlist.node.IntegerListNode;


public class IntegerHashTableFactory extends AbstractHashTableFactory<AbstractListNode<Integer>> {

	@Override
	public AbstractHashTable<AbstractListNode<Integer>> getInstance() {
		// TODO Auto-generated method stub
		return new DtoHashTable();
	}

}
