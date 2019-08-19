package com.interblocks;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.*;
import org.apache.log4j.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    String message = "Jade";
    App messageUtil = new App(message);
    private static Logger log;

    @Test
    public void testPrintMessage() {
        log.debug("Inside testPrintMessage()");
        Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void testSalutationMessage() {
        log.debug("Inside testSalutationMessage()");
        message = "Hi!" + "Jade";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }
}
