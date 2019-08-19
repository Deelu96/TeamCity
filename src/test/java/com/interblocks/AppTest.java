package com.interblocks;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.*;
import org.apache.log4j.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Unit test for simple App.
 */
public class AppTest {
    String message = "Jade";
    App messageUtil = new App(message);
    private static Logger log = null;

    public AppTest(){
        String log4JPropertyFile =System.getProperty("user.dir")+ "\\src\\log4j.properties";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(log4JPropertyFile));
            PropertyConfigurator.configure(prop);
            log = Logger.getLogger("TestStep");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
