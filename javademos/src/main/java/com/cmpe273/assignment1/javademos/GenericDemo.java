package com.cmpe273.assignment1.javademos;



public class GenericDemo<E> {
	
	public E e;
	
	public GenericDemo(E e){		
        this.e = e;
	}
	
	@SuppressWarnings("hiding")
	public <E> String printArray(){
		return e.toString();
	}
	 
	
}
