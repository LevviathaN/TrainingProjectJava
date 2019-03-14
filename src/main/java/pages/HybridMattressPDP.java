package pages; //package - is the name of folder in which program file contained

import org.openqa.selenium.*;
import utils.DriverProvider;

public class HybridMattressPDP {

    //Class attributes
    public WebDriver driver = DriverProvider.driver;
    public By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    public By viewCartButton = By.xpath("//a[@class='__to-checkout button']");


    //Class methods
    public void clickAddToCart(){
        System.out.println("Adding product to cart");
        DriverProvider.waitFor(3);
        driver.findElement(addToCartButton).click();
    }



    public void clickViewCart() {
        System.out.println("Trying to click on View Cart");
        DriverProvider.waitFor(3);
        driver.findElement(viewCartButton).click();
    }
}
