package hashtable;

import dto.StringDto;

public class StringDtoHashTableFactory extends AbstractHashTableFactory<StringDto>{

	@Override
	public AbstractHashTable<StringDto> getInstance() {
		
		return new StringDtoHashTable();
	}

}
