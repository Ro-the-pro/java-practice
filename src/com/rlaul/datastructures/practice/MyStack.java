package com.rlaul.datastructures.practice;

import java.util.EmptyStackException;

public class MyStack<T> {
	
	private class StackNode<T> {
		private T data;
		private StackNode<T> next;
		
		public StackNode (T data){
			this.data = data;
		}
	}
	
	private StackNode<T> top;
	
	public void push (T item) {
		StackNode<T> t = new StackNode<T>(item);
		t.next = top;// new item is linked to the top of stack. 
		top = t; // then top is pointed to the newly added item.
	}
	
	public T pop () {
		if(isEmpty()){
			throw new EmptyStackException();
		}
		T item = top.data; 
		top = top.next;
		
		return item;
	}
	
	public T peek() {
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int countItems() {
		int count = 0;
		StackNode t = top;
		while(t!=null) {
			count++;
			t = t.next;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
