package com.rlaul.datastructures.graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//Use stack
public class MyDepthFirstSearch2 {

    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists
    private Node n;
	private List<Node> nodes;
 
    // Constructor
    MyDepthFirstSearch2(int v)
    {
        V = v;
        nodes = new LinkedList<Node>();
        for(int i=0;i<v;i++)
        	nodes.add(new Node(0));
        
        
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    // Function to add an edge into the graph
    void addEdge(int v,int w)
    {
        nodes.get(v).addAdjacentNode(new Node(w));
    }
    
	public void DPS(Node startNode) {
		Stack<Node> s = new Stack<>();
		s.push(startNode);
		startNode.visited = true;

		while (!s.isEmpty()) {
			Node n = s.pop();
			System.out.println(n.data + " ");
			for (Node adj : n.neighbors) {
				if (!adj.visited) {
					s.push(adj);
					adj.visited = true;
				}
			}

		}

	}
	
	 
    // Driver method to
    public static void main(String args[])
    {
    	MyDepthFirstSearch2 g = new MyDepthFirstSearch2(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.printGraph();
        System.out.println("Following is Depth First Traversal "+
                           "(starting from vertex 2)");
 
        //g.DPS(new Node("2"));
    }

	private void printGraph() {
		if(nodes==null)
			System.out.println("Graph is empty");
		for(int i=0;i<nodes.size();i++) {
			System.out.println(nodes.get(i));
		}
		
	}

}
