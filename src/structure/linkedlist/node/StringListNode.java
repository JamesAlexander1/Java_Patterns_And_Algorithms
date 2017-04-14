package structure.linkedlist.node;

public class StringListNode implements Comparable<StringListNode>{

	private String value;
	private StringListNode nextDto;
	
	public StringListNode(String valueArg){
		
		setValue(valueArg);
	}
	@Override
	public int compareTo(StringListNode dto) {
		
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
	
	public StringListNode getNextDto() {
		return nextDto;
	}
	
	
	public void setNextDto(StringListNode nextDto) {
		this.nextDto = nextDto;
		
	}
}
