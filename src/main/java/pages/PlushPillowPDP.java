package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverProvider;

public class PlushPillowPDP {

    //Class attributes

    public WebDriver driver = DriverProvider.driver;
    public By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    public By BasePrice = By.xpath("//*[@id=\"product-price-209\"]/span");


    //Class methods

    public void clickAddToCart(){
        System.out.println("Adding product to cart");
        DriverProvider.waitFor(3);
        driver.findElement(addToCartButton).click();
    }

    public boolean addToCartButtonDisplayed() {
        System.out.println("checking if button available");
        DriverProvider.waitFor(3);
        return driver.findElement(addToCartButton).isDisplayed();
    }

    public boolean basePriceDisplayed() {
        System.out.println("Checking that base price displayed");
        DriverProvider.waitFor(3);
        return driver.findElement(BasePrice).isDisplayed();
    }

}
