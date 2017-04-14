package structure.linkedlist.node;

public class DoubleListNode extends AbstractListNode<Double>{

	private Double value;
	private AbstractListNode<Double> nextDto;
	
	public DoubleListNode(double newValue){
		value = newValue;
		nextDto = null;
	}
	@Override
	public int compareTo(AbstractListNode<Double> o) {
		
		Double compareValue = o.getValue();
		
		if(compareValue < value){
			return 1;
		}else{
			return -1;
		}
	}

	@Override
	public Double getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public void setValue(Double newValue) {
		
		value = newValue;
		
	}

	@Override
	public AbstractListNode<Double> getNextDto() {
		// TODO Auto-generated method stub
		return nextDto;
	}

	@Override
	public void setNextDto(AbstractListNode<Double> value) {
	
		nextDto = value;
		
	}

	

}
