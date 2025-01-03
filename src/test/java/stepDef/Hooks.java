package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.junit.jupiter.api.AfterAll;

import static helper.Utility.quitDriver;
import static helper.Utility.startDriver;

public class Hooks {

    @BeforeAll
    public static void setUp(){
    }

    @AfterAll
    public static void tearDown(){
    }

    @Before
    public void beforeTest(){
        startDriver();
    }

    @After
    public void afterTest() throws InterruptedException{
        Thread.sleep(1000);
        quitDriver();
    }
}