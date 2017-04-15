package com.rlaul.datastructures;

public class MyLinkedListNode {
	
	public MyLinkedListNode next;
	public MyLinkedListNode prev;
	public MyLinkedListNode last;
	public int data;
	
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
	
	public MyLinkedListNode clone(MyLinkedListNode data){
		//TODO:method implementation
		return data;
	}
}
