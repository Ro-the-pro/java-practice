package com.rlaul.ik;

import java.util.ArrayList;

/**
 * Given two integers n and k, find all the possible unique combinations of k numbers in range 1 to n.
 * {"n": 5,"k": 2}
 * [ [1, 2], [1, 3], [1, 4], [1, 5], [2, 3], [2, 4], [2, 5], [3, 4], [3, 5], [4, 5] ]
 * @author rohit
 *
 */

/*
 * 
 * we have to include and exclude every number. 
 * We also have to ensure that there are exactly k elements per combination
 * 
 * if(size(comb) ==k)
 * 		add to main array
 * 
 * if(num <=n)
 * 		comb = comb.add(num))
 * 		helper(comb, num+1,count(n), n, k) 
 * 		comb.remove(num)
 * 	
 * 
 * 
 */
public class NChooseKCombinations {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> resultList = find_combinations(5,2);
		printResult(resultList);
	}

	static ArrayList<ArrayList<Integer>> find_combinations(Integer n, Integer k) {
    	ArrayList<Integer> combination = new ArrayList<Integer>();
    	ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
    	
    	combination = helper(new ArrayList<Integer>(), 0, 0, n, k);
    	resultList.add(combination);
        return resultList;
    }

	static ArrayList<Integer> helper(ArrayList<Integer> combination, int num, int count, int n, int k) {
		if(combination.size() ==k) {
			System.out.print("[");
			for(int j=0;j<combination.size();j++) {
    			System.out.print(combination.get(j));
    			if(j!=k-1)
    				System.out.print(",");
    		}
			System.out.print("]\n");
			return combination;
		}
		
		for (int j=1;j<=n;j++) {
			if(!combination.contains(j)) {
				combination.add(j);
				helper(combination, j + 1, 0, n, k);
				combination.remove(combination.size() - 1);
			}
		}
		
		return combination;
	}
	

    private static void printResult(ArrayList<ArrayList<Integer>> resultList) {
    	System.out.print("[");
    	for(int i= 0;i<resultList.size();i++) {
    		ArrayList<Integer> comb = resultList.get(i);
    		System.out.print("[");
    		for(int j=0;j<comb.size();j++) {
    			System.out.print(comb.get(j)+",");
    		}
    		System.out.print("]");
    	}
    	System.out.print("]");
		
	}
	

}
