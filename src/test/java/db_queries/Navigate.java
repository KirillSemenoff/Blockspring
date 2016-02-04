package db_queries;

import core.Preconfigure;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ksemenov on 1/25/2016.
 */
public class Navigate extends Preconfigure {
    @Given("^we are in (.*) and (.*)$")
    public void weAreInAnd(String arg0, String arg1) throws Throwable {
        //WebDriver driver = new FirefoxDriver();
        By temp = By.xpath(arg0);
        driver.findElement(temp).click();
        temp = By.xpath(arg1);
        driver.findElement(temp).click();


    }



}
