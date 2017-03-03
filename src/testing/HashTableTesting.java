package testing;

import factory.IntPojoFactory;
import hashtable.AbstractHashTable;

import hashtable.IntegerHashTableFactory;
import pojo.IPojo;
import pojo.IntPojo;


public class HashTableTesting {

	public static void main(String[] args) {
		

		IntPojo[] array = (IntPojo[]) new IntPojoFactory().getArray(50);
		
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
		hashtable.print();
		
	}

}
