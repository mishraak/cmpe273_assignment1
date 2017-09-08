package com.cmpe273.assignment1.javademos;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class InterfaceTest {
	public static Animal dog, cat;
	
	@Before
	public void testInit(){
		 dog = new Dog();
		 cat = new Cat();		
	}
	
	@Test
	public void testCatNoise(){
		Assert.assertEquals("Meow Meow!!!", cat.makeNoise());
	}
	
	@Test
	public void testDogNoise(){
		Assert.assertEquals("Whoo whoo!!!", dog.makeNoise());
	}
	
	@Test
	public void testCatCallKid(){
		Assert.assertEquals("hey kitten!!!", cat.callKid());
	}
	
	@Test
	public void testDogCallKid(){
		Assert.assertEquals("hey puppy!!!", dog.callKid());
	}
	
}
