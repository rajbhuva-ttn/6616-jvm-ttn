package org.ttn;

import org.junit.Assert;
import org.junit.Test;

public class TestMain {
    @Test
    public void TestFactorial(){
        int res = Main.factorial(5);
        System.out.println("Testing Factorial");
        Assert.assertEquals(120,res);
    }
}
