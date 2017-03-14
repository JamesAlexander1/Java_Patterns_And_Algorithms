package factory;

import mergesort.IntegerMergeAlgorithm;


import dto.DtoList;
public class MergeSortFactory implements AbstractSortFactory<DtoList>{

	@Override
	public IntegerMergeAlgorithm getInstance() {
		
		return new IntegerMergeAlgorithm();
	}

	
}
