package dto;

public abstract class AbstractDto<E> implements Comparable<AbstractDto<E>>{

	public abstract E getValue();
	public abstract void setValue(E value);
	public abstract AbstractDto<E> getNextDto();
	public abstract void setNextDto(AbstractDto<E> value);
	public abstract int compareTo(AbstractDto<Integer> listB);
}
