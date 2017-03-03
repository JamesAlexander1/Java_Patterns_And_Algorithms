package factory;

import java.util.concurrent.ThreadLocalRandom;

import pojo.IPojo;
import pojo.IntPojo;

public class IntPojoFactory extends PojoFactory<Integer> {

	private static Integer MIN = 0;
	private static Integer MAX = 100;
	@Override
	public IPojo<Integer>[] getArray(Integer size) {
		
		IntPojo[] array = new IntPojo[size];
		for(int i = 0; i < size; i ++){
			
			Integer randomNum = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
			array[i] = new IntPojo(randomNum);
			
			
		}
		return array;
	}

}
