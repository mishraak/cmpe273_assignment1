package com.cmpe273.assignment1.javademos;
import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class ArrayTest {
	
	
	@Before
	public void testInitArray(){
		ArrayDemo.initArray();
	}
	
	@Test
	public void testPrintArray(){
		Assert.assertEquals(ArrayDemo.demoArray(), "0 1 4 9 16 ");
	}
	
	@Test
	public void testAddToArray(){
		Assert.assertEquals(6, ArrayDemo.addToArray(25));
	}
	
	
}
