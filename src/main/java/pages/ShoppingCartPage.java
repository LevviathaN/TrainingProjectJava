package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverProvider;

public class ShoppingCartPage {

    //Class attributes
    private WebDriver driver = DriverProvider.driver;
    private By ProceedToCheckout = By.xpath("//*[@id=\"maincontent\"]/div[5]/div/div[2]/div[1]/ul/li[1]/button/span");

    //Class Methods

    public void clickProceedToCheckout () {
        System.out.println("Trying to click on View Cart");
        DriverProvider.waitFor(5);
        driver.findElement(ProceedToCheckout).click();
    }




}
