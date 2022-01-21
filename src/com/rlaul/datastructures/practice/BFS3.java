package com.rlaul.datastructures.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS3 {
	
	int vertex; 
	LinkedList<Integer> adj[];
	
	public BFS3(int v) {
		vertex = v;
		adj = new LinkedList[vertex];
		for(int i=0;i<vertex;++i) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	public void performBFS(int currentNode) {
		boolean[] visited = new boolean[vertex];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(currentNode);
		visited[currentNode] = true;

		
		while(queue.size()!=0) {
			currentNode = queue.poll();
			System.out.println(currentNode + " ");
			Iterator<Integer> adjNodeIterator = adj[currentNode].listIterator();
			while(adjNodeIterator.hasNext()) {
				int adjNode = adjNodeIterator.next();
				if(!visited[adjNode]) {
					visited[adjNode] = true;
					queue.add(adjNode);
				}
			}
		}
		
		
		
	}

	
    public static void main(String args[])
    {
        BFS3 g = new BFS3(4);
 
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
