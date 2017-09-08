package com.cmpe273.assignment1.javademos;

import java.util.Hashtable;

public class CollectionDemo {
	public Hashtable<Integer, String> ht;
	
	
	public CollectionDemo(){
		ht=new Hashtable<Integer, String>();
	}
	
	public int initHashMap(){		
		ht.put(0, "Zero");
		ht.put(1, "One");
		return ht.size();
	}
	
	public String updateRecord(int i, String s){
		ht.put(i, s);
		return ht.get(i);
	}
	
	public int deleteRecord(int i){
		ht.remove(i);
		return ht.size();
	}
	
}	
