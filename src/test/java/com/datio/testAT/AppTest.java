package com.datio.testAT;

import com.stratio.cucumber.testng.CucumberRunner;
import cucumber.api.CucumberOptions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


@CucumberOptions(features = { "src/test/resources/features/datio.feature" })
public class AppTest {

    public void testApp()
    {
        assertTrue( true );
    }

    @Test(enabled = true, groups = {"api"})
    public void fragmentsTest() throws Exception {
        new CucumberRunner(this.getClass()).runCukes();
    }
}
