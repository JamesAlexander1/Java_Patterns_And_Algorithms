package structure.linkedlist.node;

public class IntegerListNode extends AbstractListNode<Integer> implements Comparable<AbstractListNode<Integer>>{

	private Integer value;
	private AbstractListNode<Integer> nextDto;
	
	public IntegerListNode(Integer valueArg){
		
		setValue(valueArg);
	}
	@Override
	public int compareTo(AbstractListNode<Integer> dto) {
		Integer compareQuantity = dto.getValue();
		
		//Ascending Order
		return value - compareQuantity;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
	public AbstractListNode<Integer> getNextDto() {
		return nextDto;
	}
	
	
	public void setNextDto(AbstractListNode<Integer> nextDto) {
		this.nextDto = nextDto;
		
	}
	

}
