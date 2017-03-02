package factory;

import dto.DtoList;

public class SortFactoryProducer implements IFactoryProducer<DtoList>{

	@Override
	public MergeSortFactory getFactory(String name){
		
		if(name.contains("Merge")){
			return new MergeSortFactory();
		}else{
			return null;
		}
	}

	
}
