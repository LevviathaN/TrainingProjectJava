package pages;

import org.openqa.selenium.*;
import utils.DriverProvider;

public class HomePage {

    //Class attributes
    private WebDriver driver = DriverProvider.driver;
    private String learnMoreButton = "//a[@class='button button-big button-wide button-primary p-0 px-xs-5 d-block d-xs-inline-block']";


    //Class methods
    public void openHomePage(){
        System.out.println("Opening Home Page");
        driver.get("https://www.tomorrowsleep.com");
    }

    public void openPDP(){
        System.out.println("Opening mattress PDP");
        driver.findElement(By.xpath(learnMoreButton)).click();
    }
}
