package com.rlaul.datastructures;

public class MyQueue<T> {

	private class QueueNode<T>{
		private T data;
		private QueueNode<T> next;
		
		public QueueNode(T data){
			this.data = data;
		}
	}
		
	private QueueNode<T> first;
	private QueueNode<T> last;
	
	public void add(T item){
		QueueNode<T> t = new QueueNode<T>(item);
		last.next = t;
		last = t;
		if(first ==null){
			first = last;
		}
	}
	
	public T remove(){
		T item = first.data;
		first = first.next;
		if(first == null){
			last = null;
		}
		return item;
	}
	
	public T peek(){
		return first.data;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
}
