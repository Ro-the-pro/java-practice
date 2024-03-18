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

        helper(resultList, new ArrayList<Integer>(), n, k, 1);
        return resultList;
    }

    static void helper(ArrayList<ArrayList<Integer>> resultList, ArrayList<Integer> combination, int n, int k, int start) {
        if (combination.size() == k) {
            resultList.add(new ArrayList<>(combination)); // Add a new copy of the combination
            return;
        }

        for (int j = start; j <= n; j++) {
        	System.out.println("j:"+j+", start:"+start);
            combination.add(j);
            helper(resultList, combination, n, k, j + 1);
            combination.remove(combination.size() - 1);
        }
    }

    private static void printResult(ArrayList<ArrayList<Integer>> resultList) {
        System.out.print("[");
        for (int i = 0; i < resultList.size(); i++) {
            ArrayList<Integer> comb = resultList.get(i);
            System.out.print("[");
            for (int j = 0; j < comb.size(); j++) {
                System.out.print(comb.get(j));
                if (j != comb.size() - 1)
                    System.out.print(",");
            }
            System.out.print("]");
        }
        System.out.print("]");
    }

	

}
