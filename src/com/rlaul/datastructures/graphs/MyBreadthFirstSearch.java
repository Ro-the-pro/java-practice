package com.rlaul.datastructures.graphs;

import java.util.Iterator;
import java.util.LinkedList;
	 
//Use Queue
	// Java program to print BFS traversal from a given source vertex.
	// BFS(int s) traverses vertices reachable from s.
	// This class represents a directed graph using adjacency list
	// representation
	public class MyBreadthFirstSearch
	{
	    private int verticesCount;   // No. of vertices
	    private LinkedList<Integer> adjacentNodes[]; // Adjacency Lists
	 
	    // Constructor
	    MyBreadthFirstSearch(int v)
	    {
	        verticesCount = v;
	        adjacentNodes = new LinkedList[v];
	        for (int i=0; i<v; ++i)
	            adjacentNodes[i] = new LinkedList();
	    }
	 
	    // Function to add an edge into the graph
	    void addEdge(int v,int w)
	    {
	        adjacentNodes[v].add(w);
	    }
	 
	    // prints BFS traversal from a given source s
	    void BFS(int currentNode)
	    {
	        // Mark all the vertices as not visited(By default
	        // set as false)
	        boolean visited[] = new boolean[verticesCount];
	 
	        // Create a queue for BFS
	        LinkedList<Integer> queue = new LinkedList<Integer>();
	 
	        // Mark the current node as visited and enqueue it
	        visited[currentNode]=true;
	        queue.add(currentNode);
	 
	        while (queue.size() != 0)
	        {
	            // Dequeue a vertex from queue and print it
	            currentNode = queue.poll();
	            System.out.print(currentNode+" ");
	 
	            // Get all adjacent vertices of the dequeued vertex s
	            // If a adjacent has not been visited, then mark it
	            // visited and enqueue it
	            Iterator<Integer> i = adjacentNodes[currentNode].listIterator();
	            while (i.hasNext())
	            {
	                int adjacentNode = i.next();
	                if (!visited[adjacentNode])
	                {
	                    visited[adjacentNode] = true;
	                    queue.add(adjacentNode);
	                }
	            }
	        }
	    }
	 
	    // Driver method to
	    public static void main(String args[])
	    {
	        MyBreadthFirstSearch g = new MyBreadthFirstSearch(4);
	 
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	 
	        System.out.println("Following is Breadth First Traversal "+
	                           "(starting from vertex 2)");
	 
	        g.BFS(2);
	    }
	}
	

