package hashtable;


import dto.Dto;


public class IntegerHashTableFactory extends AbstractHashTableFactory<Dto> {

	@Override
	public AbstractHashTable<Dto> getInstance() {
		// TODO Auto-generated method stub
		return new DtoHashTable();
	}

}
