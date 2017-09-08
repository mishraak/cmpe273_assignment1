package com.cmpe273.assignment1.javademos;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class GenericTest{
	
	public GenericDemo<?> gd1, gd2;
	
	@Before
	public void initStringGeneric(){
		gd1 = new GenericDemo<String>("genDemo");
		gd2 = new GenericDemo<Integer>(5);
	}
	
	@Test
	public void testPrintGeneric(){
		Assert.assertEquals("genDemo", gd1.printArray());
		Assert.assertEquals("5", gd2.printArray());
	}
	
}
