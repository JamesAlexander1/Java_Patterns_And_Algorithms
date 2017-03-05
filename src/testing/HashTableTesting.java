package testing;


import dto.AbstractDto;
import dto.Dto;

import factory.DtoFactory;
import hashtable.AbstractHashTable;

import hashtable.IntegerHashTableFactory;



public class HashTableTesting {

	public static void main(String[] args) {
		

		
		
		Dto[] test1 = DtoFactory.getArray(50);
		AbstractHashTable<AbstractDto<Integer>> hashtable = new IntegerHashTableFactory().getInstance();
		
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
