package com.rlaul.datastructures.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

	private int V;
    private LinkedList<Integer> adjacentNodes[];
	
	public BFS (int v) {
		V = v;
        adjacentNodes = new LinkedList[v];
        for (int i=0;i<v;++i) {
        	adjacentNodes[i] = new LinkedList<Integer>();
        }
	}
	
	public void addEdge(int v, int w) {
		adjacentNodes[v].add(w);
	}
	
	public void performBFS(int current) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[V];
		visited[current] = true;
		queue.add(current);
		
		while(queue.size()!=0) {
			current = queue.poll();
			System.out.print(current+" ");
			Iterator<Integer> adjNodesIterator = adjacentNodes[current].listIterator();
			while(adjNodesIterator.hasNext()) {
				Integer adjacentNode = adjNodesIterator.next();
				if(!visited[adjacentNode]) {
					visited[adjacentNode] = true;
					queue.add(adjacentNode);
					//System.out.println(nextNode + " ");
				}
			}
		}
	}
	
	
    public static void main(String args[])
    {
        BFS g = new BFS(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 0)");
 
        g.performBFS(0);
    }

}
