
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverProvider;

public class AdjustableBedPDP {

    //Class attributes

    private WebDriver driver = DriverProvider.driver;
    public By SplitKingSizeButton = By.xpath("//*[@id=\"option-label-bed_size-177-item-98\"]");
    public By TwinXLSizeButton = By.xpath("//*[@id=\"option-label-bed_size-177-item-14\"]");
    public By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    public By updateCartButton = By.xpath("//*[@id=\"product-updatecart-button\"]/span");




    //Class methods

    public void SelectSplitKingSize () {
        System.out.println("Trying to click on View Cart");
        DriverProvider.waitFor(3);
        driver.findElement(SplitKingSizeButton).click();
    }

    public void clickAddToCart(){
        System.out.println("Adding product to cart");
        DriverProvider.waitFor(3);
        driver.findElement(addToCartButton).click();
    }

    public void clicOnTwinXLSizeButton(){
        System.out.println("Click on TwinXL size button");
        DriverProvider.waitFor(3);
        driver.findElement(TwinXLSizeButton).click();
    }

    public void clicOnUpdateCartButton(){
        System.out.println("Click on update cart button");
        DriverProvider.waitFor(3);
        driver.findElement(updateCartButton).click();
    }


}
