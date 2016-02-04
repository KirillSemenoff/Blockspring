package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ksemenov on 1/25/2016.
 */
public class Preconfigure extends ApplicationSettings{
   public static WebDriver driver = new FirefoxDriver();

      public static void OpenWebSite (){
        driver.navigate().to(websiteURL);
    }

    public static void Login (){
       By login_button_xpath = By.xpath("//a[text()=\"Log in\"]");
       By login_xpath = By.xpath("//input[@id=\"user_login\"]");
       By password_xpath = By.xpath("//input[@id=\"user_password\" and @placeholder]");
       By sign_in_xpath = By.xpath("//input[@id=\"do-log-in-button\"]");
       driver.findElement(login_button_xpath).click();
       driver.findElement(login_xpath).sendKeys(username);
       driver.findElement(password_xpath).sendKeys(password);
       driver.findElement(sign_in_xpath).click();
    }

}
