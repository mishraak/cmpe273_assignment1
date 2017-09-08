package com.cmpe273.assignment1.javademos;
import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class QueueTest {	
	
	
	@Before
	public void initQueue(){
		QueueDemo.setupQueue();
	}
	@Test
	public void testQueue(){
		Assert.assertEquals(QueueDemo.demoQueue(), "m1 m2 m3 ");
	}			
}

