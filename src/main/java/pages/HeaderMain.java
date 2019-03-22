package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverProvider;

public class Header {

    //Class attributes
    public WebDriver driver = DriverProvider.driver;
    public By MiniCartIcon = By.xpath("/html/body/div[3]/header/div/div/a");
    public By ViewCartButtonM = By.xpath("//*[@id=\"minicart-content-wrapper\"]/div[2]/div[6]/div/a");
    public By ClickOnCheckoutButton = By.xpath("//*[@id=\"top-cart-btn-checkout\"]");


    //Class Methods

   public void ClickOnMiniCartIcon () {
       System.out.println("Selecting full size");
       DriverProvider.waitFor(3);
       driver.findElement(FullSizeButton).click();
   }



}
