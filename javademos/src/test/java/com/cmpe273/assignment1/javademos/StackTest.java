package com.cmpe273.assignment1.javademos;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class StackTest {
	@Before
	public void initStack(){
		StackDemo.initStack();
	}
	
	@Test
	public void testPopStack(){
		Assert.assertEquals(4, StackDemo.popStack());
	} 	
	
	@Test
	public void testPushStack(){
		Assert.assertEquals(5, StackDemo.pushStack(5));
	} 
	
	@Test
	public void testPeekStack(){
		Assert.assertEquals(5, StackDemo.pushStack(5));
	} 
	
}
