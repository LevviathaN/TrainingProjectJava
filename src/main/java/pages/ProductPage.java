package pages; //package - is the name of folder in which program file contained

import org.openqa.selenium.*;
import utils.DriverProvider;

public class ProductPage {

    //Class attributes
    private WebDriver driver = DriverProvider.driver;
    private By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    private By viewCartButton = By.xpath("//a[@class='__to-checkout button']");
    private By AddToCArtCSItem = By.xpath("//*[@id=\"modal-content-29\"]/div/div/div/div[3]/div[2]/div[3]/form/button");

    //Class methods
    public void clickAddToCart(){
        System.out.println("Adding product to cart");
        DriverProvider.waitFor(3);
        driver.findElement(addToCartButton).click();
    }


    public void AddCrossSellITem(){
        System.out.println("Adding cross sell item to cart");
        DriverProvider.waitFor(3);
        driver.findElement(AddToCArtCSItem).click();
    }

    public void clickViewVart() {
        System.out.println("Trying to click on View Cart");
        DriverProvider.waitFor(3);
        driver.findElement(viewCartButton).click();
    }
}
