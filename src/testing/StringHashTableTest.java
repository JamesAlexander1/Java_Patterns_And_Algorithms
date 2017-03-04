package testing;

import dto.StringDto;
import factory.DtoFactory;
import hashtable.StringDtoHashTable;

public class StringHashTableTest {
	
	public static void main(String[] args) {
		
		StringDto[] strings = DtoFactory.getStringArray(50);
		
		for(StringDto string : strings){
			System.out.println(string.getValue());
		}
		
		//to do: make factory
		StringDtoHashTable hashtable = new StringDtoHashTable();
		for(StringDto dto : strings){
			hashtable.insert(dto);
		}
		hashtable.print();
	}

}
