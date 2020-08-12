package com.rlaul.datastructures.graphs;

import java.util.LinkedList;

public class GraphSearch {
	
	public enum State{UNVISITED, CURRENT, VISITED}
	
	static boolean search(MyGraph g, MyNode start, MyNode end ){
		
		LinkedList<MyNode> nlist = new LinkedList<>();
		for(MyNode n: g.getVertices())
		{
			n.state = GraphSearch.State.UNVISITED;
		}
		start.state = State.CURRENT;
		nlist.add(start);
		MyNode u;
		while(!nlist.isEmpty()){
			u = nlist.removeFirst();
			if(u!=null){
				for(MyNode neighbor : u.getNeighbors()){
					if(neighbor.state == State.UNVISITED){
						if (neighbor == end){
							return true;
						}else{
							neighbor.state = State.CURRENT;
							nlist.add(neighbor);
						}
					}
					neighbor.state = State.VISITED;
				}
			}
		}
		
		return false;
	}
}
