package factory;

import mergesort.MergeAlgorithm;

import dto.DtoList;
public class MergeSortFactory implements AbstractSortFactory<DtoList>{

	@Override
	public MergeAlgorithm getInstance() {
		// TODO Auto-generated method stub
		return new MergeAlgorithm();
	}

	
}
