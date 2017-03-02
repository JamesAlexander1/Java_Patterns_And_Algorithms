package dto;

public class Dto implements Comparable<Dto>{

	private Integer value;
	private Dto nextDto;
	
	public Dto(Integer valueArg){
		
		setValue(valueArg);
	}
	@Override
	public int compareTo(Dto dto) {
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
	public Dto getNextDto() {
		return nextDto;
	}
	public void setNextDto(Dto nextDto) {
		this.nextDto = nextDto;
	}

}
