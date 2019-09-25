package com.interblocks;

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
    private String message = "Jade";
    private App messageUtil = new App(message);
    private Logger log;

    @BeforeClass
    public void setUp() throws IOException {
        String log4JPropertyFile = System.getProperty("user.dir") + "\\src\\log4j.properties";
        Properties prop = new Properties();
        prop.load(new FileInputStream(log4JPropertyFile));
        PropertyConfigurator.configure(prop);
        log = Logger.getLogger("TestStep");
    }

    @Test
    public void testPrintMessage() {
        log.debug("Inside testPrintMessage()");
        Assert.assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void tes() {
        Assert.assertEquals(message, messageUtil.printMessage());
    }



    @Test
    public void testSalutationMessage() {
        log.debug("Inside testSalutationMessage()");
        message = "Hi!" + "Jade";
        Assert.assertEquals(message, messageUtil.salutationMessage());
    }
}
