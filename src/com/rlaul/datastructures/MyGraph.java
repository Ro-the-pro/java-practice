package com.rlaul.datastructures;

public class MyGraph {
	MyNode[] vertices;
	int count; 
	
	MyGraph(){
		vertices = new MyNode[6];
	}
	
	void addNode(MyNode x){
		if(count<=30){
			vertices[count]=x;
			count++;
		}
	}

	public MyNode[] getVertices() {
		return vertices;
	}

	public int getCount() {
		return count;
	}
	
	
	

}
