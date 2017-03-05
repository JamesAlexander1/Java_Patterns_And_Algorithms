package testing;

import dto.StringDto;
import factory.DtoFactory;
import hashtable.AbstractHashTable;

import hashtable.StringDtoHashTableFactory;

public class StringHashTableTest {
	
	public static void main(String[] args) {
		
		StringDto[] strings = DtoFactory.getStringArray(150);
		
		
		
		//to do: make factory
		AbstractHashTable<StringDto> hashtable = new StringDtoHashTableFactory().getInstance();
		for(StringDto dto : strings){
			hashtable.insert(dto);
		}
		hashtable.print();
	}

}
