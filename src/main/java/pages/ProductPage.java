package pages; //package - is the name of folder in which program file contained

import org.openqa.selenium.*;
import utils.DriverProvider;

public class ProductPage {

    //Class attributes
    private WebDriver driver = DriverProvider.driver;
    private String addToCartButton = "//button[@id='product-addtocart-button']";
    private String viewCartButton = "//a[@class='__to-checkout button']";

    //Class methods
    public void clickAddToCart(){
        System.out.println("Adding product to cart");
        DriverProvider.waitFor(3);
        driver.findElement(By.xpath(addToCartButton)).click();
    }

    public void clickViewVart() {
        System.out.println("Trying to click on View Cart");
        DriverProvider.waitFor(3);
        driver.findElement(By.xpath(viewCartButton)).click();
    }
}
