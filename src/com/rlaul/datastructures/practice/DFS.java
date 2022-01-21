package com.rlaul.datastructures.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DFS {
	
	private int vertexCount;
	private LinkedList[] adjacentNodes;
	
	public DFS(int v) {
		vertexCount = v;
		adjacentNodes = new LinkedList[v];
		
		for (int i=0;i<v;++i) {
			adjacentNodes[i] = new LinkedList();
		}
	}
	
	public void addEdge(int v, int w) {
		adjacentNodes[v].add(w);
	}
	
	public void performDFS(int currentNode) {
		Stack<Integer> stack = new Stack<Integer>();
		boolean visited[] = new boolean[vertexCount];
		
		stack.push(currentNode);
		while(stack.size()!=0) {
			currentNode = stack.pop();
			visited[currentNode] = true;
			System.out.print(currentNode + " ");
			
			Iterator<Integer> iter = adjacentNodes[currentNode].listIterator();
			while(iter.hasNext()) {
				int adjacentNode = iter.next();
				if(!visited[adjacentNode]) {
					visited[adjacentNode] = true;
					stack.add(adjacentNode);
				}
			}
		}
	}
	
	
	
    public static void main(String args[])
    {
        DFS g = new DFS(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 0)");
 
        g.performDFS(0);
    }

}
