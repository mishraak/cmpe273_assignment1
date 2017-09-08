package com.cmpe273.assignment1.javademos;

public class ArrayDemo {
	static int[] array = new int[6];
	static String arrayString="";
	
	public static void initArray(){
		for(int i=0; i<5; i++){
			array[i]=i*i;
		}	
	}
	
	public static String demoArray(){											
		for(int i=0; i<5; i++){
			arrayString += array[i] + " ";
		}
		return arrayString;		
	}	
	
	
	public static int addToArray(int i){
		array[array.length-1]=i;
		return array.length;
	}
	
}
