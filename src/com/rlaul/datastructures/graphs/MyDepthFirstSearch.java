package com.rlaul.datastructures.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
	 
//Use Stack
	// Java program to print DFS traversal from a given source vertex.
	// DFS(int s) traverses vertices reachable from s.
	// This class represents a directed graph using adjacency list
	// representation
	public class MyDepthFirstSearch
	{
	    private int vertexCount;   // No. of vertices
	    private LinkedList<Integer> adjacentNodes[]; //Adjacency Lists
	 
	    // Constructor
	    MyDepthFirstSearch(int v)
	    {
	        vertexCount = v;
	        adjacentNodes = new LinkedList[v];
	        for (int i=0; i<v; ++i)
	            adjacentNodes[i] = new LinkedList();
	    }
	 
	    // Function to add an edge into the graph
	    void addEdge(int v,int w)
	    {
	        adjacentNodes[v].add(w);
	    }
	 
	    // prints DFS traversal from a given source s
	    void DFS(int s)
	    {
	        // Mark all the vertices as not visited(By default
	        // set as false)
	        boolean visited[] = new boolean[vertexCount];
	 
	        // Create a stack for DFS
	        //LinkedList<Integer> stack = new LinkedList<Integer>();
	        Stack<Integer> stack = new Stack<>();
	 
	        // Mark the current node as visited and add to stack
	        visited[s]=true;
	        stack.push(s);
	 
	        while (stack.size() != 0)
	        {
	            // Remove a vertex from stack and print it
	            s = stack.pop();
	            System.out.print(s+" ");
	 
	            // Get all adjacent vertices of the removed vertex s
	            // If a adjacent has not been visited, then mark it
	            // visited and enqueue it
	            Iterator<Integer> i = adjacentNodes[s].listIterator();
	            while (i.hasNext())
	            {
	                int adjacentNode = i.next();
	                if (!visited[adjacentNode])
	                {
	                    visited[adjacentNode] = true;
	                    stack.push(adjacentNode);
	                }
	            }
	        }
	    }
	 
	    // Driver method to
	    public static void main(String args[])
	    {
	        MyDepthFirstSearch g = new MyDepthFirstSearch(4);
	 
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	 
	        System.out.println("Following is Depth First Traversal "+
	                           "(starting from vertex 2)");
	 
	        g.DFS(0);
	    }
	}
	

