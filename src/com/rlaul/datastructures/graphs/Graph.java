package com.rlaul.datastructures.graphs;

public class Graph {
	private MyNode[] vertices;
	private int count;
	
	public Graph(){
		vertices = new MyNode[6];
		count = 0;
	}

	
	public void addNode(MyNode n){
		vertices[count] = n;
		count++;
	}
	
	public MyNode[] getNodes(){
		return vertices;
	}
}
