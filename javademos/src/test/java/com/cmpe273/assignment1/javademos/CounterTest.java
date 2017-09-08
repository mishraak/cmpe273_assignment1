package com.cmpe273.assignment1.javademos;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;

import junit.framework.Assert;
@RunWith(ConcurrentTestRunner.class)

public class CounterTest {  
    private MultithreadingDemo demo = new MultithreadingDemo();
   
    @Test
    public void testMultithreading()
    {
        Assert.assertEquals(96, 3, demo.decrementCount());
    }
}
