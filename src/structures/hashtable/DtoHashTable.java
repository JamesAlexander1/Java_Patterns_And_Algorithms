package structures.hashtable;




import structures.linkedlist.node.AbstractListNode;
import structures.linkedlist.node.IntegerListNode;


public class DtoHashTable extends AbstractHashTable<AbstractListNode<Integer>> {

	private static double DIVISION = 1.3;
	private static Integer STARTSIZE = 50;
	private Integer numOfItems;
	
	private AbstractListNode<Integer>[] table; 
	
	protected DtoHashTable(){
	
		table = new IntegerListNode[STARTSIZE];
		super.tableSize = STARTSIZE;
		numOfItems = 0;
		
		
	}
	@Override
	public void insert(AbstractListNode<Integer> item) {
		
		
		if(numOfItems >= (Integer.MAX_VALUE - 1)){
			
		}else{
			Integer key = generateHashCode(item);
			//System.out.print(key + " " );
			seperateChainAdd(table, key, item);
			numOfItems ++;
			if(numOfItems > (tableSize / DIVISION)){
				System.out.println("resizing");
				resize();
			}
		}
	}

	@Override
	public AbstractListNode<Integer> remove(AbstractListNode<Integer> item) {
		
		Integer key = generateHashCode(item);
		AbstractListNode<Integer> removedItem = table[key];
		
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
		
		System.out.println("Original hashtable:");
		print();
		System.out.println();
		IntegerListNode[] newArray = new IntegerListNode[(tableSize * 2)];
		
		int temp = tableSize;
		tableSize = (tableSize * 2);
		int temp2 = numOfItems;
		numOfItems = 0;
		
		
		
		for(int i = 0; i < temp; i ++){
			
			if(table[i] != null){
				//Integer key = table[i].hashCode() % tableSize;
				
				
				seperateChainResize(table, i, newArray);
				//numOfItems ++;
				
			}
			
		}
		
		table = newArray;
		System.out.println("original: " + temp2 +" now: " + numOfItems);
		
	}
	@Override
	public void print() {
		
		
		for(int i = 0; i < tableSize; i ++){
			
			if(table[i] != null){
				seperateChainPrint(i);
			}else{
				System.out.println(i + " : ");
			}
			
		}
		System.out.println("numOfItems = " + getNumOfItems());
		
	}

	private Integer getNumOfItems(){
		return numOfItems;
	}
	
	private void seperateChainAdd(AbstractListNode<Integer>[] table, Integer key, AbstractListNode<Integer> item){
		
		if(table[key] == null){
			
			table[key] = item;
		}else{
			
			AbstractListNode<Integer> loop = table[key];
			
			while(loop.getNextDto() != null){
				loop = loop.getNextDto();
			}
			
			loop.setNextDto(item);
		}
		//numOfItems ++;
	}
	
	private void seperateChainResize(AbstractListNode<Integer>[] oldTable, Integer key, AbstractListNode<Integer>[] newTable){
		
		AbstractListNode<Integer> dto = oldTable[key];
		
		while(dto.getNextDto() != null){
			
			Integer newKey = generateHashCode(dto);
			//System.out.print("dto = " + dto.getValue() + " newKey = " + newKey + " tableSize = " + tableSize + " ");
			seperateChainAdd(newTable, newKey, dto);
			numOfItems ++;
			AbstractListNode<Integer> prevDto = dto;
			dto = dto.getNextDto();
			prevDto.setNextDto(null);
			//newKey = 0;
			
		}
		
		//last object in list.
		Integer newKey = generateHashCode(dto);
		seperateChainAdd(newTable, newKey, dto);
		numOfItems ++;
		System.out.println();
	}
	private void seperateChainPrint(Integer key){
		
		AbstractListNode<Integer> loop = table[key];
		System.out.print(key + " : " + loop.getValue());
		while(loop.getNextDto() != null){
			
			loop = loop.getNextDto();
			System.out.print(" -> " + loop.getValue());
		}
		System.out.println();
	}
	
	private Integer generateHashCode(AbstractListNode<Integer> dto){
		return (dto.hashCode() % tableSize);
	}
}
