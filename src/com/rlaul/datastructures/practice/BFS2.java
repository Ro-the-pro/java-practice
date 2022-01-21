package com.rlaul.datastructures.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS2 {
	
	int vertexCount;
	LinkedList<Integer> adjacent[];
	
	public BFS2 (int v) {
		vertexCount = v;
		adjacent = new LinkedList[v];
		for (int i =0;i<v;++i) {
			adjacent[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int v, int w) {
		adjacent[v].add(w);
	}
	
	public void performBFS(int start){
		LinkedList<Integer> queue = new LinkedList<Integer>();
		boolean visited[] = new boolean[vertexCount];
		visited[start] = true;
		queue.add(start);
		System.out.print(start+" ");
		while (queue.size()!=0) {
			start = queue.poll();
			Iterator<Integer> iter = adjacent[start].listIterator();
			while(iter.hasNext()) {
				int node = iter.next();
				if(!visited[node]) {
					visited[node] = true;
					queue.add(node);
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
