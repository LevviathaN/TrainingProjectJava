package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverProvider;

public class PlushPillowPDP {

    //Class attributes

    public WebDriver driver = DriverProvider.driver;
    public By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");

    //Class methods

    public void clickAddToCart(){
        System.out.println("Adding product to cart");
        DriverProvider.waitFor(3);
        driver.findElement(addToCartButton).click();
    }

}
