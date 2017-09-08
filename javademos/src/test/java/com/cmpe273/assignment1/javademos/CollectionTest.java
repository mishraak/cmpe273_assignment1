package com.cmpe273.assignment1.javademos;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CollectionTest {
	
	CollectionDemo cd = new CollectionDemo();
	
	@Before
	public void testInitMap(){
		cd.initHashMap();
	}
		
	@Test
	public void testUpdateMap(){
		Assert.assertEquals("Updated", cd.updateRecord(0, "Updated"));
	}
	
	@Test
	public void testDeleteMapRecord(){
		Assert.assertEquals(1, cd.deleteRecord(0));
	}
}
