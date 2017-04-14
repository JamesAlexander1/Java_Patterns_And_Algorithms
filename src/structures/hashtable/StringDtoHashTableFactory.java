package structures.hashtable;

import structure.linkedlist.node.StringListNode;

public class StringDtoHashTableFactory extends AbstractHashTableFactory<StringListNode>{

	@Override
	public AbstractHashTable<StringListNode> getInstance() {
		
		return new StringDtoHashTable();
	}

}
