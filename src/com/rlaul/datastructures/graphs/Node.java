package com.rlaul.datastructures.graphs;

import java.util.LinkedList;
import java.util.List;

public class Node{
	int data;
	boolean visited = false;

	List<Node> neighbors = new LinkedList<Node>();
	
	public Node(int data) {
		this.data= data;
	}
	
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}

	public void addAdjacentNode(Node n) {
		this.neighbors.add(n);
		n.neighbors.add(this);
	}
	
	
	/*public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public List<Node> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(List<Node> neighbors) {
		this.neighbors = neighbors;
	}*/

}
