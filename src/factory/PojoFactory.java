package factory;

import pojo.IPojo;

public abstract class PojoFactory<E> {

	public abstract IPojo<E>[] getArray(Integer size);
}
