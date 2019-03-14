package pages;

import org.openqa.selenium.*;
import utils.DriverProvider;

public class HomePage {

    //Class attributes
    private WebDriver driver = DriverProvider.driver;
    private String learnMoreButton = "//a[@class='button button-big button-wide button-primary p-0 px-xs-5 d-block d-xs-inline-block']";
    private String shopButton = "//*[text()='Shop']";
    private String adjustableBed = "(//p[text()='Adjustable Bed'])[3]";


    //Class methods
    public void openHomePage() {
        System.out.println("Opening Home Page");
        driver.get("https://www.tomorrowsleep.com");
    }

    public void openPDP() {
        System.out.println("Opening mattress PDP");
        driver.findElement(By.xpath(learnMoreButton)).click();
    }

    public void openAdjustableBed() {
        System.out.println("Opening Adjustable Bed");
        DriverProvider.waitFor(3);
        driver.findElement(By.xpath(shopButton)).click();
        DriverProvider.waitFor(3);
        driver.findElement(By.xpath(adjustableBed)).click();

    }

}

