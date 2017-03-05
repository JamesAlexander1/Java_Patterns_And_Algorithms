package dto;

public class Dto extends AbstractDto<Integer> implements Comparable<AbstractDto<Integer>>{

	private Integer value;
	private AbstractDto<Integer> nextDto;
	
	public Dto(Integer valueArg){
		
		setValue(valueArg);
	}
	@Override
	public int compareTo(AbstractDto<Integer> dto) {
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
	
	public AbstractDto<Integer> getNextDto() {
		return nextDto;
	}
	
	
	public void setNextDto(AbstractDto<Integer> nextDto) {
		this.nextDto = nextDto;
		
	}
	

}
