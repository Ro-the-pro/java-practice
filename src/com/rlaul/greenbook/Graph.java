package com.rlaul.greenbook;

public class Graph {
	private Node[] vertices;
	private int count;
	
	public Graph(){
		vertices = new Node[6];
		count = 0;
	}

	
	public void addNode(Node n){
		vertices[count] = n;
		count++;
	}
	
	public Node[] getNodes(){
		return vertices;
	}
}
