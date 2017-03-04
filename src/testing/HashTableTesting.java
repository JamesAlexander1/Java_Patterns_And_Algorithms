package testing;


import dto.Dto;
import dto.DtoList;
import factory.DtoFactory;
import hashtable.AbstractHashTable;

import hashtable.IntegerHashTableFactory;



public class HashTableTesting {

	public static void main(String[] args) {
		

		/*IntPojo[] array = (IntPojo[]) new IntPojoFactory().getArray(50);
		
		AbstractHashTable<IntPojo> hashtable;
		hashtable = new IntegerHashTableFactory().getInstance();
		for(IPojo<Integer> pojo : array){
			System.out.print(pojo.get() + " ");
			
		}
		System.out.println();
		
		for(IntPojo pojo : array){
			
			hashtable.insert(pojo);
			
		}
		
		System.out.println();
		
		System.out.println(" printing");
		hashtable.print();*/
		
		Dto[] test1 = DtoFactory.getArray(50);
		AbstractHashTable<Dto> hashtable = new IntegerHashTableFactory().getInstance();
		
		System.out.print("initial array: ");
		for(Dto temp : test1){
			System.out.print(temp.getValue() + " ");
		}
		
		for(Dto temp: test1){
			hashtable.insert(temp);
		}
		
		hashtable.print();
		
		
		
		
	}

}
