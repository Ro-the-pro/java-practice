package com.rlaul.datastructures;
/*
 * 1 -> 2 -> 3 -> 4 -> 5 -> 6
 * 
 * node data to be added:
 * d=8, between 4 and 5
 * n.next = 5, n.prev = 4
 * n.next = this.next, n.prev = this, prev.next = this // 4 -> n-> 5
 */
public class MyLinkedListNode {
	
	public MyLinkedListNode next;
	public MyLinkedListNode prev;
	public MyLinkedListNode last;
	public int data;
	
	public MyLinkedListNode() {
		data=0;
		next = null; 
		prev = null;
	}
	
	public MyLinkedListNode(int d, MyLinkedListNode n, MyLinkedListNode p){
		next = n; 
		prev = p;
		data = d;
	}
	
	public void setNext(MyLinkedListNode n){
		next = n;
		if(this==last){
			last  = n;
		}
		if(n!=null && n.prev!=this){
			n.setPrevious(this);
		}
	}

	public void setPrevious(MyLinkedListNode p) {
		prev = p;
		if(p!=null && p.next!=this){
			p.setNext(this);
		}
	}
	
	public String printForward(){
		if (next!=null){
			return data +"->" + next.printForward();
		}
		else{
			return ((Integer)data).toString();
		}
	}
	
	public MyLinkedListNode clone(){
		//TODO:method implementation
		return this;
	}
}
