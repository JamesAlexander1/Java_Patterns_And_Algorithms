package hashtable;


import pojo.IntPojo;

public class IntegerHashTableFactory extends AbstractHashTableFactory<IntPojo> {

	@Override
	public AbstractHashTable<IntPojo> getInstance() {
		// TODO Auto-generated method stub
		return new DtoHashTable();
	}

}
