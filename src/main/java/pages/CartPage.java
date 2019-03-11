package pages;

import org.openqa.selenium.*;
import utils.DriverProvider;

public class CartPage {

    //Class attributes
    private WebDriver driver = DriverProvider.driver;
    private String ProceedToCheckoutButton = "//*[@class='action primary checkout']";


    //Class methods
    public void clickProceedToCheckout(){
        System.out.println("OnCheckoutPage");
        driver.findElement(By.xpath(ProceedToCheckoutButton)).click();
    }


}