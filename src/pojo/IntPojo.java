package pojo;

public class IntPojo implements IPojo<Integer> {

	private Integer value;
	private IntPojo next;
	
	public IntPojo(){
		this(0);
	}
	public IntPojo(Integer item){
		value = item;
	}
	@Override
	public void set(Integer item) {
		
		value = item;
		
	}

	@Override
	public Integer get() {
		
		return value;
	}
	public IntPojo getNext() {
		return next;
	}
	public void setNext(IntPojo next) {
		this.next = next;
	}

}
