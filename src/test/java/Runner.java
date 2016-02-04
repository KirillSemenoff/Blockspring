/**
 * Created by ksemenov on 1/22/2016.
 */

//import core.BaseTest;
import core.Preconfigure;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
features = "src/test/Features/")


public class Runner extends Preconfigure {

    @BeforeClass
    public static void setUp (){
        Preconfigure.OpenWebSite();
        Preconfigure.Login();
    }

    @AfterClass
    public static void TearDown(){
      driver.quit();
   }
}
