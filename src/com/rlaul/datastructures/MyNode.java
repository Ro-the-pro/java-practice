package com.rlaul.datastructures;

import com.rlaul.greenbook.GraphSearch;

public class MyNode {
	MyNode[] neighbors;
	String vertex;
	int adjacentCount;
	public GraphSearch.State state;
	private MyNode[] adjacent;
	
	MyNode(String vertex, int numberOfNeighbors){
		this.vertex = vertex;
		adjacentCount = 0;
		neighbors = new MyNode[numberOfNeighbors];
	}
	
	void addNeighbor(MyNode x){
		
	}

	public MyNode[] getNeighbors() {
		return neighbors;
	}

	public String getVertex() {
		return vertex;
	}
	
	public void addAdjacentNode(MyNode n){
		this.adjacent[adjacentCount] = n;
		adjacentCount++;
	}
	
	public MyNode[] getAdjacentNodes(){
		return adjacent;
	}
	

}
