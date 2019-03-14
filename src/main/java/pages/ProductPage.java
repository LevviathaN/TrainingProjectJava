package pages; //package - is the name of folder in which program file contained

import org.openqa.selenium.*;
import utils.DriverProvider;

public class ProductPage {

    //Class attributes
    private WebDriver driver = DriverProvider.driver;
    private String addToCartButton = "//button[@id='product-addtocart-button']";
    private String viewCartButton = "//a[@class='__to-checkout button']";
    private String ViewSpecialPrice = "//*[@id='old-price-5']";
    private String ViewBaselPrice = "//*[@id='product-price-338']";
    private String productName = "//*[@data-ui-id='page-title-wrapper']";

    //Class methods
    public void clickAddToCart(){
        System.out.println("Adding product");
        DriverProvider.waitFor(3);
        driver.findElement(By.xpath(addToCartButton)).click();
    }

    public void clickViewCart() {
        System.out.println("Trying to click on View Cart");
        DriverProvider.waitFor(3);
        driver.findElement(By.xpath(viewCartButton)).click();
    }

    public boolean isProductPageOpened(){
        return driver.findElement(By.xpath(ViewSpecialPrice)).isDisplayed();
    }

    public boolean isadjustablePageOpened(){
        return driver.findElement(By.xpath(ViewBaselPrice)).isDisplayed();
    }

    public boolean isFindProductName(){ return driver.findElement(By.xpath(productName)).isDisplayed();
    }

}
