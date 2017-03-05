package hashtable;


import dto.AbstractDto;
import dto.Dto;


public class IntegerHashTableFactory extends AbstractHashTableFactory<AbstractDto<Integer>> {

	@Override
	public AbstractHashTable<AbstractDto<Integer>> getInstance() {
		// TODO Auto-generated method stub
		return new DtoHashTable();
	}

}
