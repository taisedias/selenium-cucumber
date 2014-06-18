package demo.activeadmin.info.resources.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static demo.activeadmin.info.resources.support.Driver.createFirefoxDriver;
import static demo.activeadmin.info.resources.support.Driver.shutdownDriver;

public class TestPreparation {

    @Before
    public void setUp() {
        createFirefoxDriver();
    }

    @After
    public void tearDown() {
        shutdownDriver();
    }
}
