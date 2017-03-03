package hashtable;




import pojo.IPojo;
import pojo.IntPojo;

public class DtoHashTable extends AbstractHashTable<IntPojo> {

	private static Integer STARTSIZE = 50;
	private Integer numOfItems;
	
	private IntPojo[] table; //Cant use IPojo<Integer> because of generic array issues.
	
	protected DtoHashTable(){
	
		table = new IntPojo[STARTSIZE];
		super.tableSize = STARTSIZE;
		numOfItems = 0;
		
		//hashtable = (IPojo<E>[]) Array.newInstance(hashtable.getClass().getComponentType(), STARTSIZE);
	}
	@Override
	public void insert(IntPojo item) {
		
		
		if(numOfItems < (Integer.MAX_VALUE - 1)){
			
			Integer key = item.hashCode() % tableSize;
			//System.out.print(key + " " );
			if(table[key] == null){
				System.out.print(numOfItems + ":");
				table[key] = item;
				System.out.println(table[key].get());
				
				numOfItems ++;
				
			}else{
				
			}
			
			if(numOfItems > (tableSize / 2)){
				System.out.println("resizing");
				resize();
			}
		}else{
			
			//throw Runtime Exception
		}
	}

	@Override
	public IntPojo remove(IntPojo item) {
		
		Integer key = item.hashCode() % tableSize;
		IntPojo removedItem = table[key];
		
		if(removedItem != null){
			table[key] = null;
			numOfItems --;
			return removedItem;
		}else{
			return null;
		}
		
	}

	@Override
	protected void resize() {
		
		IntPojo[] newArray = new IntPojo[tableSize * 2];
		int temp = tableSize;
		tableSize = (tableSize * 2);
		int temp2 = numOfItems;
		numOfItems = 0;
		System.out.println("table size now :" + tableSize);
		
		for(int i = 0; i < temp; i ++){
			if(table[i] != null){
				Integer key = table[i].hashCode() % tableSize;
				if(newArray[key] != null){
					newArray[key] = table[i];
					numOfItems ++;
				}
			}
			
		}
		
		table = newArray;
		System.out.println("original: " + temp2 +" now: " + numOfItems);
		
	}
	@Override
	public void print() {
		
		for(int i = 0; i < tableSize; i ++){
			
			
			if(table[i] != null){
				System.out.print(table[i].get() + " ");
				
				
			}
		}
		System.out.println();
		System.out.println(numOfItems + " " + tableSize);
		System.out.println();
		
		
	}

	public Integer getNumOfItems(){
		return numOfItems;
	}
}
