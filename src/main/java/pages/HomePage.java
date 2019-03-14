package pages;

import org.openqa.selenium.*;
import utils.DriverProvider;

public class HomePage {

    //Class attributes
    public WebDriver driver = DriverProvider.driver;
    public By learnMoreButton = By.xpath("//a[@class='button button-big button-wide button-primary p-0 px-xs-5 d-block d-xs-inline-block']");
    public By ShopButton = By.xpath("/html/body/div[3]/header/div/nav/div/ul[1]/li[1]/a");




    //Class methods
    public void openHomePage(){
        System.out.println("Opening Home Page");
        driver.get("https://www.tomorrowsleep.com");
    }

    public void openPDP(){
        System.out.println("Opening mattress PDP");
        driver.findElement(learnMoreButton).click();
    }

    public void clickOnShopButton () {
        System.out.println("click on shop button");
        DriverProvider.waitFor(5);
        driver.findElement(ShopButton).click();
    }
}
