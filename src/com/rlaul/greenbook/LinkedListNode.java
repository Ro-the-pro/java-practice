package com.rlaul.greenbook;

public class LinkedListNode {

	public LinkedListNode next;
	public LinkedListNode prev;
	public LinkedListNode last;
	int data;
	
	public LinkedListNode(int d,LinkedListNode prev, LinkedListNode next){
		this.prev = prev;
		this.next = next;
		this.data = d;
	}
	
	public LinkedListNode() { }
	
	public void addNext(LinkedListNode n){
		this.next = n;
		if(this == last){
			last = this;
		}
		if(n!=null && n.prev!=this){
			n.prev = this;
		}
	}
	
	public void addPrevious(LinkedListNode n){
		
	}
	
	public LinkedListNode clone(LinkedListNode data){
		return data;
	}

}
