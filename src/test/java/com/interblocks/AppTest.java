package com.interblocks;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    String message = "Jade";
    App messageUtil = new App(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Jade";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }
}
