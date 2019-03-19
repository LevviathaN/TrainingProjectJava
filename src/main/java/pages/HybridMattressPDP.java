package pages; //package - is the name of folder in which program file contained

import org.openqa.selenium.*;
import utils.DriverProvider;

public class HybridMattressPDP {

    //Class attributes
    public WebDriver driver = DriverProvider.driver;
    public By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    public By AddCrossSellItemButton = By.xpath("//*[@id=\"modal-content-38\"]/div/div/div/div[3]/div[1]/div[3]/form/button/span");
    public By viewCartButton = By.xpath("//a[@class='__to-checkout button']");
    public By FullSizeButton = By.xpath("//*[@id=\"option-label-bed_size-177-item-15\"]");


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

    public boolean addToCartButtonDisplayed() {
        System.out.println("checking if button available");
        DriverProvider.waitFor(3);
        return driver.findElement(addToCartButton).isDisplayed();
    }


    public void selectFullSizeButton() {
        System.out.println("Selecting full size");
        DriverProvider.waitFor(3);
        driver.findElement(FullSizeButton).click();
    }

    public void clickAddCrossSellItemButton() {
        System.out.println("Selecting full size");
        DriverProvider.waitFor(3);
        driver.findElement(AddCrossSellItemButton).click();
    }

}
