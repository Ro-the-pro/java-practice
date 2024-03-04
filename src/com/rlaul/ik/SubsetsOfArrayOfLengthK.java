package com.rlaul.ik;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubsetsOfArrayOfLengthK {

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		
		getSubsets(input, 2);

	}
	
	private static int getSubsets(List<Integer> input, int i) {
		List<HashSet<Integer>> resultSet = new ArrayList<HashSet<Integer>>();
		subsetHelper(input , 2, 0, new HashSet<Integer>(), resultSet);
		
		System.out.println("Result:\n"+resultSet);	
		return resultSet!=null?resultSet.size():0;
	}

	static void subsetHelper( List<Integer> inputList, int r,  int index, HashSet<Integer> partial, List<HashSet<Integer>> resultList) {
		
		// no input or preventing IndexOOBE
		if(inputList==null || index == inputList.size()) {
			return;
		}
		
		//Only one unique subset possible with length of the original string
		if (r==inputList.size()) {
			resultList.add(new HashSet<Integer>(inputList.get(index)));
		}
		
		//the size reached the desired length, add it to the result.
		if (partial.size() == r) {
			resultList.add(new HashSet<Integer>(partial));
			return;
		}
		
		//include number
		partial.add(inputList.get(index));
		subsetHelper(inputList, r, index+1, partial, resultList);

		//exclude number
		partial.remove(inputList.get(index));
		subsetHelper(inputList, r, index+1, partial, resultList);
	}

}
