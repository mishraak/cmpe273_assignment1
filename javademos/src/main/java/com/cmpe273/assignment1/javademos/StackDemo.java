package com.cmpe273.assignment1.javademos;
import java.util.Stack;

public class StackDemo {
	public static Stack<Integer> stack = new Stack<Integer>();
	
	public static void initStack(){
		for(int i=0; i<5; i++){
			stack.push(i);
		}
	}
	
	public static int popStack(){
		return stack.pop();
	}
		
	public static int pushStack(int i){
		stack.push(i);
		return stack.peek();
	}
	
	public static int peekStack(){
		return stack.peek();
	}
}
