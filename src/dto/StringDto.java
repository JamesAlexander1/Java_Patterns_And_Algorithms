package dto;

public class StringDto implements Comparable<StringDto>{

	private String value;
	private StringDto nextDto;
	
	public StringDto(String valueArg){
		
		setValue(valueArg);
	}
	@Override
	public int compareTo(StringDto dto) {
		
		byte[] compareBytes = dto.getValue().getBytes();
		byte[] bytes = value.getBytes();
		for(int i = 0; i < bytes.length; i ++){
			
			if(compareBytes[i] != bytes[i]){
				
				return((char)compareBytes[i] - (char)bytes[i]);
			}
		}
		
		
		//Ascending Order
		
		return 0;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public StringDto getNextDto() {
		return nextDto;
	}
	
	
	public void setNextDto(StringDto nextDto) {
		this.nextDto = nextDto;
		
	}
}
