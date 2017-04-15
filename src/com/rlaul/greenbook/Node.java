package com.rlaul.greenbook;

public class Node {

	
	private String vertex;
	private int adjacentCount;
	
	public String getVertex() {
		return vertex;
	}

	private Node[] adjacent;
	
	
	
	public Node(String vertex, int adjacentLength){
		this.vertex = vertex;
		this.adjacent = new Node[adjacentLength];
		adjacentCount = 0; 
	}
	
	public void addAdjacentNode(Node n){
		this.adjacent[adjacentCount] = n;
		adjacentCount++;
	}
	
	public Node[] getAdjacentNodes(){
		return adjacent;
	}
	
}
