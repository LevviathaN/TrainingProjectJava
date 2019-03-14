package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverProvider;

public class ShoppingCartPage {

    //Class attributes
    public WebDriver driver = DriverProvider.driver;
    public By ProceedToCheckout = By.xpath("//*[@id=\"maincontent\"]/div[5]/div/div[2]/div[1]/ul/li[1]/button/span");
    public By PlusButton = By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/div/div/button[2]/span");
    public By MinusButton =  By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/div/div/button[1]/span");
    public By RemoveButton = By.xpath("//*[@id=\"shopping-cart-table\"]/tbody[1]/tr/td[1]/a[1]");
    public By EditButton = By.xpath("//*[@id=\"shopping-cart-table\"]/tbody[1]/tr/td[4]/a/span");


    //Class Methods

    public void clickProceedToCheckout () {
        System.out.println("Trying to click on View Cart");
        DriverProvider.waitFor(3);
        driver.findElement(ProceedToCheckout).click();
    }

    public void clickOnPlusButton () {
        System.out.println("Clicking on plus button");
        DriverProvider.waitFor(3);
        driver.findElement(PlusButton).click();
    }

    public void clickOnMinusButton () {
        System.out.println("Clicking on minus button");
        DriverProvider.waitFor(3);
        driver.findElement(MinusButton).click();
    }

    public void clickOnRemoveButton () {
        System.out.println("Clicking on remove button");
        DriverProvider.waitFor(3);
        driver.findElement(RemoveButton).click();
    }

    public void clickOnEditButton () {
        System.out.println("Clicking on edit button");
        DriverProvider.waitFor(3);
        driver.findElement(EditButton).click();
    }

}
