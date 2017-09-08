package com.cmpe273.assignment1.javademos;

import java.util.LinkedList;
import java.util.List;

public class QueueDemo {
	static List<String> queue = new LinkedList<String>();
	static String queueString="";
	public static List<String> setupQueue(){		
		queue.add("m1");
		queue.add("m2");
		queue.add("m3");
		return queue;
	}
	
	public static String addToQueue(String msg){
		queue.add(msg);
		return QueueDemo.demoQueue();
	}
	
	
	public static String demoQueue(){		
		for(String msg : queue){
			queueString+=msg+" ";
		}		
		return queueString;		
	}
	

}
